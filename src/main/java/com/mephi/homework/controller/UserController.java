package com.mephi.homework.controller;


import com.mephi.homework.entity.User;
import com.mephi.homework.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/user-api/v1")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/users")
    public List<User> findALlUsers(){
        return userService.findAllUsers();
    }

    @PostMapping("/users")
    public ResponseEntity<User> addNewUser(@RequestBody User user){
        var createduser = userService.addNewUser(user);
        return new ResponseEntity<>(createduser, HttpStatus.CREATED);

    }
}
