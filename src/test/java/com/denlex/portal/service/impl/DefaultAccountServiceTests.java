package com.denlex.portal.service.impl;

import com.denlex.portal.domain.Account;
import com.denlex.portal.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by Shishkov A.V. on 29.07.18.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DefaultAccountServiceTests {
	@Autowired
	private AccountService accountService;

	@Test
	public void findByEmail_findByEmail() {
		Account account = new Account("test@mail.ru", "test", "test");
		accountService.save(account);
		assertEquals("test@mail.ru не найден", account.getEmail(), accountService.findByEmail(account.getEmail()).getEmail());
	}

	@Test
	public void findByEmail_nullWhenNotExists() {
		Account account = new Account("test@mail.ru", "test", "test");
		accountService.save(account);
		assertNull("t@mail.ru exists", accountService.findByEmail("t@mail.ru"));
	}
}
