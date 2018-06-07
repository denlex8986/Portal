package com.denlex.portal.service.impl;

import com.denlex.portal.dao.UserRepository;
import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Service
public class DefaultUserService implements UserService {

	private UserRepository userRepository;

	public DefaultUserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<>();
		StreamSupport.stream(userRepository.findAll().spliterator(), false).forEach(e -> users.add(e));
		return users;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
