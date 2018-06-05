package com.denlex.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Shishkov A.V. on 05.06.18.
 */
@Controller
@RequestMapping(path = {"/", "/welcome"})
public class WelcomeController {
	@GetMapping
	public String welcome(Model model) {
		model.addAttribute("title", "Вас приветствует зелепупкинский мегагамерский портал");
		return "index";
	}
}
