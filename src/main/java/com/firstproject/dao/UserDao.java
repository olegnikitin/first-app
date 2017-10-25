package com.firstproject.dao;

import com.firstproject.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, Integer> {
}
