package com.besttocode.serverproductmanagement.service;

import com.besttocode.serverproductmanagement.model.User;

import java.util.List;

public interface UserService {

    User saveUser(User user);

    //save = create or update
    User updateUser(User user);

    void deleteUser(Long userId);

    User findByUsername(String username);

    List<User> findAllUsers();

    Long numberOfUsers();
}
