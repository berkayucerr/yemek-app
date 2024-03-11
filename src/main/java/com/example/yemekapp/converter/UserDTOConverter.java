package com.example.yemekapp.converter;

import com.example.yemekapp.dto.UserDTO;
import com.example.yemekapp.entity.User;
import lombok.NonNull;

public class UserDTOConverter {
    public static UserDTO userToUserDTO(User user) {
        return UserDTO.builder()
                .mail(user.getMail())
                .name(user.getName())
                .surname(user.getSurname())
                .number(user.getNumber())
                .build();
    }
    public static User userDTOToUser(UserDTO user) {
        return User.builder()
                .mail(user.getMail())
                .name(user.getName())
                .surname(user.getSurname())
                .number(user.getNumber())
                .build();
    }
}
