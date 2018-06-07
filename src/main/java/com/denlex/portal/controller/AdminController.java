package com.denlex.portal.controller;

import com.denlex.portal.service.UserService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 07.06.18.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

	private final  static Logger logger = LogManager.getLogger(AdminController.class);

	private UserService userService;

	public AdminController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/users")
	public String getUsers(Model model) {
		model.addAttribute("users", userService.getAllUsers());
		return "users";
	}
}
