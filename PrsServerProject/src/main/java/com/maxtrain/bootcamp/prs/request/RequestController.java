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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.maxtrain.bootcamp.prs.util.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping(path="/request")
public class RequestController {

	@Autowired
	private RequestRepository requestRepo;
	
	@GetMapping()
 	public @ResponseBody JsonResponse getAll( ) {
		Iterable<Request> request = requestRepo.findAll();
		    return JsonResponse.getInstance(request);
	   }
	@GetMapping("/{id}")
	public @ResponseBody JsonResponse get(@PathVariable Integer id) {
	
			Optional<Request> request = requestRepo.findById(id);
			if(!request.isPresent()) {
				return JsonResponse.getInstance("Request not found");
	   }
			return JsonResponse.getInstance(request.get());
       }
	private JsonResponse save(Request request) {
		try {
			return JsonResponse.getInstance(requestRepo.save(request));
		}catch  (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
		}
	@PostMapping()
	public JsonResponse add(@RequestBody Request request) {
		try {
			return save(request);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	    }	
		@PutMapping("/{id}")
	public @ResponseBody JsonResponse update(@RequestBody Request request, @PathVariable Integer id) {
			return save(request);
		}
		@DeleteMapping("/{id}")
	public @ResponseBody JsonResponse delete(@PathVariable Integer id) {
			try {
				Optional<Request> request = requestRepo.findById(id);
				if(!request.isPresent()) {
					return JsonResponse.getInstance("Request not found");
				}
				requestRepo.deleteById(id);
				return JsonResponse.getInstance(request.get());
			}catch (Exception ex) {
				return JsonResponse.getInstance(ex.getMessage());
			}

	     }
 }

