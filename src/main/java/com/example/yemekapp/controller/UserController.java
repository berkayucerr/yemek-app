package com.example.yemekapp.controller;

import com.example.yemekapp.dto.UserDTO;
import com.example.yemekapp.entity.User;
import com.example.yemekapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/user-api")
public class UserController implements UserApi{

    private final UserService service;

    @Override
    public User addUser(UserDTO userDTO) {
        return service.save(userDTO);
    }

    @Override
    public void deleteUser(String userId) {
        service.delete(userId);
    }

    @Override
    public UserDTO getUser(String userId) {
        return service.findById(userId);
    }

    @Override
    public User updateUser(User user) {
        return service.update(user);
    }
}
