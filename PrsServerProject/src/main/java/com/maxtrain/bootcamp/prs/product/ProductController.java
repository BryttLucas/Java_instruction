package com.maxtrain.bootcamp.prs.product;


import java.util.*;

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
import org.springframework.web.bind.annotation.RestController;

import com.maxtrain.bootcamp.prs.util.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping(path="/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepo;


@GetMapping()
	public JsonResponse getAll( ) {
	Iterable<Product> product = productRepo.findAll();
	return JsonResponse.getInstance(product);  
}
@GetMapping("/{id}")
public JsonResponse get(@PathVariable Integer id) {
	try {
		if (id==null) return JsonResponse.getInstance("Parameter id cannot be null");
		Optional<Product> product = productRepo.findById(id);
		if(!product.isPresent()) {
			return JsonResponse.getInstance("Product not found");
	}
	   return JsonResponse.getInstance(product.get());
  }catch(Exception ex) {
       return JsonResponse.getInstance(ex);
 }
}

private JsonResponse save(Product product) {
	try {
		return JsonResponse.getInstance(productRepo.save(product));
	}catch (IllegalArgumentException ex) {
		return JsonResponse.getInstance("Parameter product cannot be null");
	}catch (Exception ex) {
	    return JsonResponse.getInstance(ex);
	}
}
@PostMapping()   
public JsonResponse Insert(@RequestBody Product product) {
	try {
	return save(product);
	}catch (Exception ex) {
		return JsonResponse.getInstance(ex);
	}
}
@PutMapping("{/id}")
public JsonResponse update(@RequestBody Product product, @PathVariable Integer id) { 
	try {
	if(id !=product.getId())  return JsonResponse.getInstance("Parameter id cannot be null");
			return save(product);
	}catch (Exception ex) {
		return JsonResponse.getInstance(ex);
	}
}

@DeleteMapping("{/id}")
public  JsonResponse delete(@PathVariable Integer id) {
		try {
			if(id == null) return JsonResponse.getInstance("Parameter id cannot be null"); 
			Optional<Product> product = productRepo.findById(id);
			if(!product.isPresent()) return JsonResponse.getInstance("product not found");
	        productRepo.deleteById(product.get().getId());
		    return JsonResponse.getInstance(product.get());
		}catch (Exception ex) {
			return JsonResponse.getInstance(ex);
	 	
		}
    }
}
	
