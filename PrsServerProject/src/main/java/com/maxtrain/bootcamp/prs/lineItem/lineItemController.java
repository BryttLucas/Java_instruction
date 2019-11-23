package com.maxtrain.bootcamp.prs.lineItem;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.maxtrain.bootcamp.prs.lineItem.lineItem.LineItem;
import com.maxtrain.bootcamp.prs.util.JsonResponse;

public class lineItemController {

	@CrossOrigin
	@RestController
	@RequestMapping("/line-items")
	public class LineItemController {

		@Autowired
		private LineitemRepository lineRepo;

		@GetMapping()
		public JsonResponse getAll() {
			Iterable<lineItem> line = lineRepo.findAll();
			return JsonResponse.getInstance(line);
		}
	}

	@GetMapping("/{id}")
	private JsonResponse get(@PathVariable Integer id) {
		try {
			Optional<lineItem> line = lineRepo.findById(id);
			if (!line.isPresent())
				return JsonResponse.getInstance("User not Found");
			return JsonResponse.getInstance(line);
		} catch (Exception e) {
			return JsonResponse.getInstance(e);
		}
	}

	private JsonResponse save(LineItem line) {
		try {
			LineItem lineI = lineRepo.save(line);
			return JsonResponse.getInstance(lineI);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

	@PostMapping()
	private JsonResponse insert(@RequestBody LineItem line) {
		try {
			return save(line);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);
		}
	}

	@PutMapping()
	public JsonResponse update(@RequestBody LineItem line) {
		try {
			return save(line);
		} catch (Exception e) {
			e.printStackTrace();
			return JsonResponse.getInstance(e);

		}
	}

	@DeleteMapping("/{id}")
		public JsonResponse delete(@PathVariable Integer id) {
			try {
				Optional<lineItem> line =lineRepo.findById(id);
				if(line.isPresent()) {
					lineRepo.deleteById(id);
				}
				return JsonResponse.getInstance("User cannot be found.")
			}catch (Exception e) {
				e.printStackTrace();
				return JsonResponse.getInstance(e);
			}
		}
}
