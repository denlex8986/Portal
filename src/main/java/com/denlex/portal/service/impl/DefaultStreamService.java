package com.denlex.portal.service.impl;

import com.denlex.portal.service.StreamService;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;

/**
 * Created by Shishkov A.V. on 05.06.18.
 */

@Service
@Transactional
public class DefaultStreamService implements StreamService {
	@PostConstruct
	private void init() {

	}
}
