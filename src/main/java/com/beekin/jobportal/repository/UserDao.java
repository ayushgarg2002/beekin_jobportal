package com.beekin.jobportal.repository;


import com.beekin.jobportal.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao  extends CrudRepository<User, Long> {
}
