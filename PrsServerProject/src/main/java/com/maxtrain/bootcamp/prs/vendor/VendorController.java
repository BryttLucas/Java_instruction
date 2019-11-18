package com.maxtrain.bootcamp.prs.vendor;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.maxtrain.bootcamp.prs.util.JsonResponse;

@CrossOrigin
@Controller
@RequestMapping(path="/vendor")
public class VendorController {

	@Autowired
	private VendorRepository vendorRepo;


	@GetMapping("/")
	public Iterable<Vendor> listVendor() {
		return vendorRepo.findAll();
	}

	@GetMapping("/{id}")
	public java.util.Optional<Vendor> getVendor(@PathVariable int id) {
		return vendorRepo.findById(id);
	}

	@PostMapping("/")
	public JsonResponse addVendor(@RequestBody Vendor vendor) {
		JsonResponse jr = null;
		vendorRepo.save(vendor);
		try {
			jr = JsonResponse.getInstance(vendorRepo.save(vendor));

		} catch (Exception e) {
			e.printStackTrace();
			jr = JsonResponse.getInstance(e);
		}
		return jr;
	}
	private JsonResponse save(Vendor v) {
		try {
			return JsonResponse.getInstance(vendorRepo.save(v));
		}catch  (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
	}
	@PostMapping()   
	public @ResponseBody JsonResponse Insert(@RequestBody Vendor vendor) {
		return save(vendor);
	}
	@PutMapping("/{id}")
	public @ResponseBody JsonResponse update(@RequestBody Vendor vendor, @PathVariable Integer id) {
		return save(vendor);
	}
	@DeleteMapping("/{id}")
	public @ResponseBody JsonResponse delete(@PathVariable Integer id) {
		try {
			Optional<Vendor> vendor = vendorRepo.findById(id);
			if(!vendor.isPresent()) {
				return JsonResponse.getInstance("Vendor not found");
			}
			vendorRepo.deleteById(id);
			return JsonResponse.getInstance(vendor.get());
		}catch (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}

   }
}