package com.denlex.portal.service.impl;

import com.denlex.portal.repo.AccountRepository;
import com.denlex.portal.model.Account;
import com.denlex.portal.service.AccountService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Service
public class DefaultAccountService implements AccountService {

	private AccountRepository accountRepository;

	public DefaultAccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}

	@Override
	public void save(Account account) {
		accountRepository.save(account);
	}

	@Override
	public List<Account> findAll() {
		List<Account> accounts = new ArrayList<>();
		StreamSupport.stream(accountRepository.findAll().spliterator(), false).forEach(e -> accounts.add(e));
		return accounts;
	}

	@Override
	public Account findByEmail(String email) {
		return accountRepository.findByEmail(email);
	}
}
