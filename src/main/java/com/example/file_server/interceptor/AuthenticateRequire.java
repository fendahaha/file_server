package com.example.file_server.interceptor;

import com.example.file_server.dictionary.Role;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthenticateRequire {
    Role value() default Role.Base;

}
