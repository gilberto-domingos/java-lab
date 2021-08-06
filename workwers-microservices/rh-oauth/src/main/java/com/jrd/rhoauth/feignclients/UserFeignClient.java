package com.jrd.rhoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jrd.rhoauth.entity.User;


@Component
@FeignClient(name = "rh-user", path = "/users")
public interface UserFeignClient {
	
	@GetMapping("/search")
	public ResponseEntity<User> findEmail(@RequestParam String email);

}
