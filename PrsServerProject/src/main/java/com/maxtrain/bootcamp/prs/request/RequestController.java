package com.maxtrain.bootcamp.prs.request;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maxtrain.bootcamp.prs.util.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping(path = "/requests")
public class RequestController {
	public static final String REQUEST_STATUS_NEW = "NEW";
	public static final String REQUEST_STATUS_EDIT = "EDIT";
	public static final String REQUEST_STATUS_REVIEW = "REVIEW";
	public static final String REQUEST_STATUS_APPROVE = "APPROVE";
	public static final String REQUEST_STATUS_REJECTED = "REJECTED";

	@Autowired
	private RequestRepository requestRepo;

	@GetMapping()
	public JsonResponse getAll() {
		try {
			Iterable<Request> request = requestRepo.findAll();
			return JsonResponse.getInstance(request);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable Integer id) {
		try {
			Optional<Request> request = requestRepo.findById(id);
			if (!request.isPresent()) {
				return JsonResponse.getInstance("Request not found");
			}
			return JsonResponse.getInstance(request.get());
		} catch (IllegalArgumentException ex) {
			return JsonResponse.getInstance("Id must not be null");
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	private JsonResponse save(Request request) {
		try {
			return JsonResponse.getInstance(requestRepo.save(request));
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
	}

	@PostMapping()
	public JsonResponse insert(@RequestBody Request request) {
		try {
			request.setStatus(REQUEST_STATUS_NEW);
			return save(request);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	@PutMapping("/{id}")
	public JsonResponse update(@RequestBody Request request, @PathVariable Integer id) {
		try {
			if (id != request.getId()) {
				return JsonResponse.getInstance("Parameter id doesn't match request");
			}
			return save(request);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	@DeleteMapping("/{id}")
	public JsonResponse delete(@PathVariable Integer id) {
		try {
			if (id == null)
				return JsonResponse.getInstance("Parameter id cannot be null");
			Optional<Request> request = requestRepo.findById(id);
			if (!request.isPresent())
				return JsonResponse.getInstance("Request not found");
			requestRepo.deleteById(request.get().getId());
			return JsonResponse.getInstance(request.get());
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	@GetMapping("/reviews/{userId}")
	public JsonResponse getRequestWithStatusOfReview(@PathVariable Integer userId) {
		try {
			if (userId == null)
				return JsonResponse.getInstance("UserId parameter cannot be null");
			Iterable<Request> requests = requestRepo.getRequestByStatusAndUserIdNot(REQUEST_STATUS_REVIEW, userId);
			return JsonResponse.getInstance(requests);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	private JsonResponse setRequestStatus(Request request, String status) {
		try {
			request.setStatus(status);
			return save(request);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	@PutMapping("/approve/{id}")
	public JsonResponse approve(@RequestBody Request request, @PathVariable Integer id) {
		try {
			if (id != request.getId()) {
				return JsonResponse.getInstance("Parameter id doesn't match request");
			}
			return setRequestStatus(request, REQUEST_STATUS_APPROVE);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}
	}

	@PutMapping("/reject/{id}")
	public JsonResponse reject(@RequestBody Request request, @PathVariable Integer id) {
		try {
			if (id != request.getId()) {
				return JsonResponse.getInstance("Parameter id doesn't match request");
			}
			return setRequestStatus(request, REQUEST_STATUS_REJECTED);
		} catch (Exception ex) {
			return JsonResponse.getInstance(ex);
		}

	}
}