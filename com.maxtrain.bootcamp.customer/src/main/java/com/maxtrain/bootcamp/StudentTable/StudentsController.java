package com.maxtrain.bootcamp.StudentTable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class StudentsController {

	@CrossOrigin
	@Controller
	@RequestMapping(path="/")
	public class UserController {

		@Autowired
		private StudentsRepository studentRepo;
		
@GetMapping("/authenticate")
public @ResponseBody JsonResponse authenticate(@RequestBody ) {
		String username = user.getUsername();
		String password = user.getUsername();
		User user = studentRepo.findByUsernameAndPassword(username, password);
      }
 	}
}