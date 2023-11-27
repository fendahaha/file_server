package com.example.file_server.validate.constraint.validator;


import com.example.file_server.validate.constraint.CustomConstraint;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CustomConstraintValidator implements ConstraintValidator<CustomConstraint, String> {

    @Override
    public void initialize(CustomConstraint constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        // 自定义验证逻辑
        return value != null && value.matches("[A-Za-z0-9]+");
    }
}
