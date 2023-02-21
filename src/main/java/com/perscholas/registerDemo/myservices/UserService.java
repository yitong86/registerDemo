package com.perscholas.registerDemo.myservices;

import com.perscholas.registerDemo.UserRegistrationDto;
import com.perscholas.registerDemo.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registration);
}

