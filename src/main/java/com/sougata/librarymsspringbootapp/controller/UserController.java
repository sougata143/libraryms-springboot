package com.sougata.librarymsspringbootapp.controller;

import com.sougata.librarymsspringbootapp.domain.User;
import com.sougata.librarymsspringbootapp.service.UserService;
import org.apache.tomcat.util.digester.DocumentProperties;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.Charset;

@RestController
@RequestMapping("/api/library")
public class UserController {

    private final Logger log = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User> listUsers(){
        return userService.list();
    }

    @PostMapping(value = "/saveuser")
    public User save( User user){
        return userService.save(user);
    }

    @DeleteMapping("/deleteuser/{id}")
    public void deleteUser(@PathVariable("id") long id){
        userService.delete(id);
    }

    @PutMapping("/updateuser/{id}")
    public User updateUser(@PathVariable("id") User user){
        return userService.update(user);
    }

}