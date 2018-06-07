package com.denlex.portal.service;

import com.denlex.portal.model.User;

import java.util.List;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
public interface UserService {
	void saveUser(User user);

	List<User> getAllUsers();

	User findByEmail(String email);
}
