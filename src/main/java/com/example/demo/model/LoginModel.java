package com.example.demo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class LoginModel {
    @NotNull
    @NotEmpty
    private String username;
    @NotNull
    @NotEmpty
    // customs validate password
    private String password;
}
