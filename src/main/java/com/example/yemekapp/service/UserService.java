package com.example.yemekapp.service;

import com.example.yemekapp.converter.UserDTOConverter;
import com.example.yemekapp.dto.UserDTO;
import com.example.yemekapp.entity.User;
import com.example.yemekapp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;


    public User save(UserDTO from) {
        User user = UserDTOConverter.userDTOToUser(from);
        return repository.save(user);
    }

    public User update(User from) {
        return repository.save(from);
    }

    public void delete(String id) {
        repository.deleteById(id);
    }

    public UserDTO findById(String id) {
        Optional<User> user = repository.findById(id);
        if (user.isPresent()) {
            return UserDTOConverter.userToUserDTO(user.get());
        }
        throw new RuntimeException("User not found by id:" + id);
    }

}
