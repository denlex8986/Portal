package com.denlex.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * Created by Shishkov A.V. on 05.06.18.
 */
@Controller
@RequestMapping(path = {"/", "/index"})
public class WelcomeController {

	private static Logger logger = LogManager.getLogManager().getLogger(WelcomeController.class
			.getName());

	@GetMapping
	public String welcome() {
		return "index";
	}

	@GetMapping(path = "/forum")
	public String forum() {
		return "forum";
	}


}
