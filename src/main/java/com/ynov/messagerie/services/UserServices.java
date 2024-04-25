package com.ynov.messagerie.services;

import com.ynov.messagerie.models.User;

import java.util.List;

public interface UserServices {
    User createUser(User user);
    List<User> getAllUsers();
}
