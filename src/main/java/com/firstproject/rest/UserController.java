package com.firstproject.rest;

import com.firstproject.dao.UserDao;
import com.firstproject.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(method = RequestMethod.GET, path = "/API/users/{id}")
    public ResponseEntity<User> getUser(@PathVariable Integer id) {
        User user = userDao.findOne(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/API/users")
    public ResponseEntity<User> updateUser(@RequestBody User dataForUpdate) {
        return ResponseEntity.ok(userDao.save(dataForUpdate));
    }

    @RequestMapping(method = RequestMethod.POST, path = "/API/users")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userDao.save(user));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/API/users/{id}")
    public ResponseEntity<User> deleteUser(@RequestParam Integer id) {
        if (userDao.exists(id)) {
            userDao.delete(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
