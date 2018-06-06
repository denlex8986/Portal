package com.denlex.portal.controller;

import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Shishkov A.V. on 05.06.18.
 */
@RestController
@RequestMapping(path = {"/", "/index", "/welcome"})
public class WelcomeController {

	private UserService userService;

	private static Logger logger = LogManager.getLogManager().getLogger(WelcomeController.class
			.getName());

	public WelcomeController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping
	public String welcome() {
		return "index";
	}

	@GetMapping(path = "/forum")
	public String forum() {
		return "forum";
	}

	@GetMapping("/random_user")
	public User getRandomUser() {
		User user = new User();
		user.setId(1L);
		user.setEmail("test@mail.ru");
		user.setLogin("test");
		user.setPassword("password");
		return user;
	}

	@PostMapping(path = "/register")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		logger.info("User was register");
		return new ResponseEntity<>(user, HttpStatus.OK);
//		userService.saveUser(user);
	}
}
