package com.denlex.portal.repo;

import com.denlex.portal.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
