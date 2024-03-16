package com.example.yemekapp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "user")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    String id;
    String name;
    String surname;
    String mail;
    String number;

}
