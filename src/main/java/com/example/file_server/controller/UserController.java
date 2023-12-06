package com.example.file_server.controller;

import com.example.file_server.entity.User;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserServiceImpl userService;

    @PostMapping("/login")
    public Object login(HttpSession httpSession, @RequestBody @Validated UserLoginForm userLoginForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        User user = userService.getUser(userLoginForm);
        if (user != null) {
            httpSession.setAttribute("user", user);
            httpSession.setMaxInactiveInterval(3600 * 2);
            return ResponseUtil.ok("success");
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    @PostMapping("/is_login")
    public Object isLogin(@SessionAttribute(name = "user", required = false) User user) {
        return ResponseUtil.ok(user != null);
    }

    @PostMapping("/logout")
    public Object logout(HttpSession session) {
        session.invalidate();
        return ResponseUtil.ok("success");
    }

    @PostMapping("/register")
    public Object register(@RequestBody @Validated UserRegisterForm userRegisterForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        int register = userService.register(userRegisterForm);
        if (register > 0) {
            return ResponseUtil.ok(register);
        }
        return ResponseUtil.internalServerError(null);
    }

    @PostMapping("/list")
    public Object list() {
        return "";
    }

    @PostMapping("/delete")
    public Object delete() {
        return "";
    }

    @PostMapping("/update")
    public Object update() {
        return "";
    }

    @PostMapping("/create")
    public Object create() {
        return "";
    }

}
