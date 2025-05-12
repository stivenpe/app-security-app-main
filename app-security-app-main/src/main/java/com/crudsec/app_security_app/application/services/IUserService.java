package com.crudsec.app_security_app.application.services;

import java.util.List;
import java.util.Optional;

import com.crudsec.app_security_app.domain.entity.User;

public class IUserService {
     +
      List<User> findAll();

    Optional<User> findById(Long id);

    User save(User user);
    
}


