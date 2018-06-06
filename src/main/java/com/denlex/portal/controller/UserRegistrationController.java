package com.denlex.portal.controller;

import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@RestController
@RequestMapping(path = {"/", "/index"})
public class UserRegistrationController {


	private final  static Logger logger = LogManager.getLogger(UserRegistrationController.class);

	private UserService userService;

	public UserRegistrationController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public List<User> getUsers() {
		return userService.getAllUsers();
	}

	@PostMapping(path = "/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		logger.info("User was register");
		userService.saveUser(user);
		return new ResponseEntity<>(user, HttpStatus.OK);
	}
}
