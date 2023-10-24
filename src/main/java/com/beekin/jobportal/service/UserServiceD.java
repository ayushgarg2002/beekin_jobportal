package com.beekin.jobportal.service;

import com.beekin.jobportal.entity.User;
import org.springframework.stereotype.Service;
@Service

public interface UserServiceD {
    Iterable<User> getAllUsers();

    User getUserById(Long userId);

    User createUser(User user);

    User updateUser(Long userId, User user);

    void deleteUser(Long userId);
}
