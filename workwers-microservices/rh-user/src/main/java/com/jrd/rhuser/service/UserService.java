package com.jrd.rhuser.service;

import com.jrd.rhuser.entity.User;

public interface UserService {
   public User create(User user);
   public User findById(Long id);
   public User findByEmail(String email);
}
