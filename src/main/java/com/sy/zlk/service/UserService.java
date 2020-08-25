package com.sy.zlk.service;

import com.sy.common.model.User;

public interface UserService {
    User Login(String username, String password);
    User findByUsername(String username);
}
