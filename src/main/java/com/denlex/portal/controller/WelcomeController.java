package com.denlex.portal.controller;

import com.denlex.portal.model.Account;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * Created by Shishkov A.V. on 05.06.18.
 */
@Controller
@RequestMapping(path = {"/", "/index"})
public class WelcomeController {

	private static final Logger logger = LogManager.getLogger(WelcomeController.class.getName());

	@ModelAttribute
	public void initModel(Model model) {
		model.addAttribute("account", new Account());
	}

	@GetMapping
	public String welcome() {
		return "index";
	}

	@GetMapping(path = "/forum")
	public String forum() {
		return "forum";
	}
}
