package com.example.file_server.interceptor;

import java.lang.annotation.*;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface AuthenticateRequire {
    String value() default "";

}
