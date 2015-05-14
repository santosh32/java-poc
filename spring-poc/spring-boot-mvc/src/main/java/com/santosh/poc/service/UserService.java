package com.santosh.poc.service;

import java.util.List;

import com.santosh.poc.domain.User;

public interface UserService {

    User save(User user);

    List<User> getList();

}
