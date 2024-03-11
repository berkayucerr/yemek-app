package com.example.yemekapp.dto;

import com.example.yemekapp.entity.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDTO {

    @JsonProperty("name")
    String name;
    @JsonProperty("surname")
    String surname;
    @JsonProperty("mail")
    String mail;
    @JsonProperty("number")
    String number;

}
