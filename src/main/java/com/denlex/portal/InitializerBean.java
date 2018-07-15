package com.denlex.portal;

import com.denlex.portal.model.Account;
import com.denlex.portal.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Shishkov A.V. on 04.07.18.
 */
@Component
public class InitializerBean {
	@Autowired
	private AccountService accountService;

	@PostConstruct
	public void init() {
		accountService.save(new Account("vanya@mail.ru", "vanya", "vanya"));
		accountService.save(new Account("alex@mail.ru", "alex", "alex"));
		accountService.save(new Account("denis@mail.ru", "denis", "denis"));
		accountService.save(new Account("eugen@gmail.com", "eugen", "eugen"));
		accountService.save(new Account("karoline@gmail.com", "karoline", "karoline"));
		accountService.save(new Account("simon@yahoo.com", "simon", "simon"));
		accountService.save(new Account("artur@rambler.com", "rambler", "rambler"));
		accountService.save(new Account("flash@yandex.ru", "flash", "flash"));
		accountService.save(new Account("roxy@gmail.com", "roxy", "roxy"));
	}
}
