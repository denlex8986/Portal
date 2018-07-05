package com.denlex.portal;

import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * Created by Shishkov A.V. on 04.07.18.
 */
@Component
public class InitializerBean {
	@Autowired
	private UserService userService;

	@PostConstruct
	public void init() {
		userService.save(new User("vanya@mail.ru", "vanya", "vanya"));
		userService.save(new User("alex@mail.ru", "alex", "alex"));
		userService.save(new User("denis@mail.ru", "denis", "denis"));
		userService.save(new User("eugen@gmail.com", "eugen", "eugen"));
		userService.save(new User("karoline@gmail.com", "karoline", "karoline"));
		userService.save(new User("simon@yahoo.com", "simon", "simon"));
		userService.save(new User("artur@rambler.com", "rambler", "rambler"));
		userService.save(new User("flash@yandex.ru", "flash", "flash"));
		userService.save(new User("roxy@gmail.com", "roxy", "roxy"));
	}
}
