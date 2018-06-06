package com.denlex.portal.service.impl;

import com.denlex.portal.dao.UserRepository;
import com.denlex.portal.model.User;
import com.denlex.portal.service.UserService;
import org.springframework.stereotype.Service;

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
}
