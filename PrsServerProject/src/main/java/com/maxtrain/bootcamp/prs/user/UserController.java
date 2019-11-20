package com.maxtrain.bootcamp.prs.user;

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
import org.springframework.web.bind.annotation.RestController;

import com.maxtrain.bootcamp.prs.util.JsonResponse;

@CrossOrigin
@RestController
@RequestMapping(path="/users")
public class UserController {

	@Autowired
	private UserRepository userRepo;

	@GetMapping("/authenticate")
	public JsonResponse authenticate(@RequestBody User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		try {
			User u = userRepo.findByUsernameAndPassword(username, password);
			if(u == null) {
			}
			return JsonResponse.getInstance(u);
		}catch (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
	}
	
	@GetMapping()
 	public JsonResponse getAll( ) {
		Iterable<User> user = userRepo.findAll();
		return JsonResponse.getInstance(user);  
	}
	@GetMapping("/{id}")
	public JsonResponse get(@PathVariable Integer id) {
		try {
			Optional<User> u = userRepo.findById(id);
			if(!u.isPresent()) {
				return JsonResponse.getInstance("User not found");
		}
		return JsonResponse.getInstance(u.get());
   }catch(Exception ex) {
	    return JsonResponse.getInstance(ex.getMessage());
        }
    }
    private JsonResponse save(User user) {
		try {
			User u = userRepo.save(user);
			return JsonResponse.getInstance(u);
		}catch  (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
	}
	@PostMapping()   
	public  JsonResponse Insert(@RequestBody User user) {
		return save(user);
	}
	@PutMapping("{/id}")
	public  JsonResponse update(@RequestBody User user, @PathVariable Integer id) {
		return save(user);
	}
	@DeleteMapping("{/id}")
	public JsonResponse delete(@PathVariable Integer id) {
		try {
			Optional<User> u = userRepo.findById(id);
			if(!u.isPresent()) {
			return JsonResponse.getInstance("User not found");
		}
		userRepo.deleteById(id);
		return JsonResponse.getInstance(u.get());
		}catch (Exception ex) {
			return JsonResponse.getInstance(ex.getMessage());
		}
		
	 }
  }
  