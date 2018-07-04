package com.denlex.portal.controller;

import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Shishkov A.V. on 04.07.18.
 */
@Controller
@RequestMapping(path = "/users")
public class UserController {
	private UserService service;

	public UserController(UserService service) {
		this.service = service;
	}

	@GetMapping(path = "/list")
	@ResponseBody
	public List<User> getAllUsers() {
		return service.findAll();
	}

	@GetMapping
	public String showAllUsers(Model model) {
		model.addAttribute("users", service.findAll());
		return "users";
	}
}
