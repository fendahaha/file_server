package com.example.file_server.validate;

import com.example.file_server.validate.constraint.CustomConstraint;
import com.example.file_server.validate.group.ValidationGroups;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {

    @CustomConstraint(message = "Username is not valid")
    @NotBlank(groups = ValidationGroups.BasicInfo.class)
    private String username;

    @Email(groups = ValidationGroups.BasicInfo.class)
    private String email;

    @Size(min = 10, groups = ValidationGroups.AdvancedInfo.class)
    private String description;

}