package com.sy.zlk.service.impl;

import com.sy.common.model.User;
import com.sy.zlk.repository.UserRepository;
import com.sy.zlk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(isolation = Isolation.DEFAULT)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;
    @Override
    public User Login(String username, String password) {
        return repository.findByUsernameAndPassword ( username,password );
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername ( username );
    }
}
