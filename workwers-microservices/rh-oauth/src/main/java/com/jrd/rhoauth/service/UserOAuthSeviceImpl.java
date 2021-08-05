package com.jrd.rhoauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jrd.rhoauth.entity.User;
import com.jrd.rhoauth.feignclients.UserFeignClient;

@Service
public class UserOAuthSeviceImpl implements UserOAuthService {

	private static Logger logger = LoggerFactory.getLogger(UserOAuthSeviceImpl.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public UserOAuthSeviceImpl(UserFeignClient userFeignClient) {
		this.userFeignClient = userFeignClient;
	}

	@Override
	public User findEmail(String email) {
		User user = this.userFeignClient.findEmail(email).getBody();

		if (user == null) {
			logger.error("Email not found " + email);
			throw new IllegalArgumentException("Email not found");

		}
			logger.info("Email found " + email);
			return user;
	}

}
