package com.mephi.homework.service;


import com.mephi.homework.entity.User;
import com.mephi.homework.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;


    public List<User> findAllUsers(){
        return userRepository.findAll();
    }

    public User addNewUser(User user){
        return  userRepository.save(user);
    }
}
