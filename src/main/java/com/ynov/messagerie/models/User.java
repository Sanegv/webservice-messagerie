package com.ynov.messagerie.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String firstname;
    private String lastname;

    @Column(unique = true)
    @Email(message = "Invalid email address")
    private String email;

    private boolean isAccountValidated;
    private String validateCode;
}
