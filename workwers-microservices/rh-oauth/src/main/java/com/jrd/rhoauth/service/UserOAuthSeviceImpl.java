package com.jrd.rhoauth.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jrd.rhoauth.entity.User;
import com.jrd.rhoauth.feignclients.UserFeignClient;

@Service
public class UserOAuthSeviceImpl implements UserOAuthService, UserDetailsService {

	private static Logger logger = LoggerFactory.getLogger(UserOAuthSeviceImpl.class);

	@Autowired
	private UserFeignClient userFeignClient;

	public UserOAuthSeviceImpl(UserFeignClient userFeignClient) {
		this.userFeignClient = userFeignClient;
	}

	/// you can remove 
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

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = this.userFeignClient.findEmail(username).getBody();

		if (user == null) {
			logger.error("Email not found " + username);
			throw new UsernameNotFoundException("Email not found");

		}
			logger.info("Email found " + username);
			return user;
	}

}





