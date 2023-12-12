package com.example.file_server.controller;

import com.example.file_server.entity.User;
import com.example.file_server.form.UserLoginForm;
import com.example.file_server.form.UserRegisterForm;
import com.example.file_server.form.UserUpdateForm;
import com.example.file_server.service.impl.UserServiceImpl;
import com.example.file_server.utils.ResponseUtil;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
            return ResponseUtil.ok(user);
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    @PostMapping("/is_login")
    public Object isLogin(@SessionAttribute(name = "user", required = false) User user) {
        return ResponseUtil.ok(user != null);
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

    @PostMapping("/register")
    public Object register(@RequestBody @Validated UserRegisterForm userRegisterForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
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

    @PostMapping("/update")
    public Object update(HttpSession session,
                         @RequestBody @Validated UserUpdateForm userUpdateForm, BindingResult bindingResult) {
        if (bindingResult.hasFieldErrors()) {
            return ResponseUtil.badRequest(getBindingError(bindingResult));
        }
        try {
            boolean b = userService.updateUser(userUpdateForm);
            if (b) {
                User user = userService.getUserByUUID(userUpdateForm.getUserUuid());
                session.setAttribute("user", user);
            }
            return ResponseUtil.ok(b);
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseUtil.internalServerError(null);
        }
    }

    @PostMapping("/create")
    public Object create() {
        return "";
    }

}
