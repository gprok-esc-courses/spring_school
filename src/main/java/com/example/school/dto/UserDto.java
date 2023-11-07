package com.example.school.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    @NotEmpty(message = "Username is mandatory")
    private String username;

    @NotEmpty(message = "Password is mandatory")
    private String password;
}
