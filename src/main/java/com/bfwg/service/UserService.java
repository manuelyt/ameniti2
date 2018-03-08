package com.bfwg.service;

import com.bfwg.model.User;

import java.util.List;

/**
 * Created by manu on 2018-3-8.
 */
public interface UserService {
    User findById(Long id);
    User findByUsername(String username);
    List<User> findAll ();
}
