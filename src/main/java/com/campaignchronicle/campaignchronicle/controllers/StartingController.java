package com.campaignchronicle.campaignchronicle.controllers;

import com.campaignchronicle.campaignchronicle.entities.Users;
import com.campaignchronicle.campaignchronicle.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class StartingController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/all")
    public List<Users> starterPrint() {
        List<Users> users = userRepository.findAll();
        System.out.println(users);
        return users;
    }
}
