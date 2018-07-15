package com.denlex.portal.service;

import com.denlex.portal.model.Account;

import java.util.List;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
public interface AccountService {
	void save(Account account);

	List<Account> findAll();

	Account findByEmail(String email);
}
