package com.example.file_server.controller;

import com.example.file_server.dictionary.UserType;
import com.example.file_server.entity.User;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.form.UserUpdateForm;
import com.example.file_server.interceptor.AuthenticateRequire;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserServiceImpl userService;

    /*用户和主播登录*/
    @PostMapping("/login")
    public Object login(HttpSession httpSession, @RequestBody @Validated UserLoginForm userLoginForm) {
        User user = userService.getUser(userLoginForm);
        if (user != null && user.getUserType() != UserType.Administrator.getValue()) {
            httpSession.setAttribute("user", user);
            httpSession.setMaxInactiveInterval(3600 * 2);
            return ResponseUtil.ok(user);
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    /*管理员登录*/
    @PostMapping("/adminLogin")
    public Object adminlogin(HttpSession httpSession, @RequestBody @Validated UserLoginForm userLoginForm) {
        User user = userService.getUser(userLoginForm);
        if (user != null && user.getUserType() == UserType.Administrator.getValue()) {
            httpSession.setAttribute("user", user);
            httpSession.setMaxInactiveInterval(3600 * 2);
            return ResponseUtil.ok(user);
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    @PostMapping("/getLoginUser")
    public Object getUser(@SessionAttribute(name = "user", required = false) User user) {
        if (user != null) {
            return ResponseUtil.ok(user);
        }
        return ResponseUtil.badRequest("未登录");
    }

    @PostMapping("/logout")
    public Object logout(HttpSession session) {
        session.invalidate();
        return ResponseUtil.ok("success");
    }

    @PostMapping("/registClient")
    public Object register(@RequestBody @Validated UserRegisterForm userRegisterForm) {
        try {
            if (userService.userExist(userRegisterForm.getUserName())) {
                return ResponseUtil.badRequest("账号已存在");
            }
            User user = userService.registerUser(userRegisterForm);
            if (user != null) {
                return ResponseUtil.ok(user);
            }
        } catch (Exception e) {
            return ResponseUtil.internalServerError(null);
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
    @AuthenticateRequire
    @PostMapping("/update")
    public Object update(HttpSession session, @RequestBody @Validated UserUpdateForm userUpdateForm) {
        userService.updateUser(userUpdateForm);
        User user = userService.getUserByUUID(userUpdateForm.getUserUuid());
        session.setAttribute("user", user);
        return ResponseUtil.ok(true);
    }

    @PostMapping("/create")
    public Object create() {
        return "";
    }

}
