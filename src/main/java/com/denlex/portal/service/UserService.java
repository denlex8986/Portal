package com.denlex.portal.service;

import com.denlex.portal.model.User;

import java.util.List;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
public interface UserService {
	void save(User user);

	List<User> findAll();

	User findByEmail(String email);
}
