package com.denlex.portal.repo;

import com.denlex.portal.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Shishkov A.V. on 06.06.18.
 */
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	Account findByEmail(String email);

	Account findByLogin(String login);
}
