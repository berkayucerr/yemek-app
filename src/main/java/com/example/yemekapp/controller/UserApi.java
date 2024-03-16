package com.example.yemekapp.controller;

import com.example.yemekapp.dto.UserDTO;
import com.example.yemekapp.entity.User;
import com.example.yemekapp.service.UserService;
import org.springframework.web.bind.annotation.*;


public interface UserApi {

    @PostMapping("/save")
    User addUser(@RequestBody UserDTO userDTO);

    @DeleteMapping("/{userId}")
    void deleteUser(@PathVariable String userId);

    @GetMapping("/{userId}")
    UserDTO getUser(@PathVariable String userId);

    @PutMapping("/update")
    User updateUser(@RequestBody User user);



}
