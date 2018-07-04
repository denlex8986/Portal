package com.denlex.portal.service.impl;

import com.denlex.portal.repo.UserRepository;
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
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public List<User> findAll() {
		List<User> users = new ArrayList<>();
		StreamSupport.stream(userRepository.findAll().spliterator(), false).forEach(e -> users.add(e));
		return users;
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}
}
