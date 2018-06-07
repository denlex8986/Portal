package com.denlex.portal.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Shishkov A.V. on 05.06.18.
 */
@Controller
@RequestMapping(path = {"/", "/index"})
public class WelcomeController {

	private static final Logger logger = LogManager.getLogger(WelcomeController.class.getName());

	@GetMapping
	public String welcome() {
		return "index";
	}

	@GetMapping(path = "/forum")
	public String forum() {
		return "forum";
	}
}
