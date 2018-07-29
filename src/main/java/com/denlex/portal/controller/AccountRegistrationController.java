package com.denlex.portal.controller;

import com.denlex.portal.domain.Account;
import com.denlex.portal.service.AccountService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Controller
@RequestMapping(path = {"/accounts"})
public class AccountRegistrationController {
	@Autowired
	private AccountService accountService;

	private final static Logger logger = LogManager.getLogger(AccountRegistrationController.class);

	@PostMapping(path = "/check_email", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public boolean checkEmailExistence(@RequestBody String email) {
		return accountService.findByEmail(email) != null;
	}

	@PostMapping(path = "/check_login", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ResponseBody
	public boolean checkLoginExistence(@RequestBody String login) {
		return accountService.findByLogin(login) != null;
	}

	@PostMapping(path = "/register")
	public String registerUser(@Valid @RequestBody Account account, BindingResult bindingResult) {

		if (bindingResult.hasErrors())
			return "error";

		logger.info("Account was register");
		accountService.save(account);
		return "redirect:/index";
	}

	@PostMapping(path = "email_exists")
	public ResponseEntity<Account> checkUserByEmail(@RequestParam(name = "email") String email) {
		Account account = accountService.findByEmail(email);
		return new ResponseEntity<>(account, HttpStatus.OK);
	}
}
