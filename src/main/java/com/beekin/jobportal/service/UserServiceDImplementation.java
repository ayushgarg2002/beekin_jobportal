package com.beekin.jobportal.service;

import com.beekin.jobportal.entity.User;
import com.beekin.jobportal.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceDImplementation implements UserServiceD{
    @Autowired
    private UserDao userDao; // Inject the UserRepository

    public List<User> getAllUsers() {
        return (List<User>) userDao.findAll();
    }

    public User getUserById(Long userId) {
        return userDao.findById(userId).orElse(null);
    }

    public User createUser(User user) {
        return userDao.save(user);
    }

    public User updateUser(Long userId, User user) {
        if (userDao.existsById(userId)) {
            user.setId(userId);
            return userDao.save(user);
        }
        return null; // User not found
    }

    public void deleteUser(Long userId) {
        userDao.deleteById(userId);
    }
}
