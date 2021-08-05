package com.jrd.rhoauth.service;

import com.jrd.rhoauth.entity.User;

public interface UserOAuthService {
	public User findEmail(String email);
}
