package com.denlex.portal.dao;

import com.denlex.portal.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	User findByEmail(String email);
}
