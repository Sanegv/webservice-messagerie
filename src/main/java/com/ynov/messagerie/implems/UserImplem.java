package com.ynov.messagerie.implems;

import com.ynov.messagerie.models.User;
import com.ynov.messagerie.repos.UserRepo;
import com.ynov.messagerie.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImplem implements UserServices {
    @Autowired
    UserRepo userRepo;

    @Override
    public User createUser(User user) {
        return userRepo.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.findAll();
    }
}
