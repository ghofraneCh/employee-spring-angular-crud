package com.ghofrane.spring.crud.spring.crud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@NoArgsConstructor @AllArgsConstructor @Data
@Table(name = "employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 10, max = 200, message
            = "About First Name must be between 3 and 20 characters")
    private String firstName;
    @NotNull
    @Size(min = 10, max = 200, message
            = "About Last Name must be between 3 and 20 characters")
    private String lastName;
    @Email (message = "Email should be true")
    private String emailId;

}
