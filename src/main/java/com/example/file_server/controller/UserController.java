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

import java.util.HashMap;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Autowired
    private UserServiceImpl userService;

    private final Integer sessionMaxInactiveInterval = 3600 * 2;
    private final String userAttributeName = "userInfo";

    /*用户和主播登录*/
    @PostMapping("/login")
    public Object login(HttpSession httpSession, @RequestBody @Validated UserLoginForm userLoginForm) {
        HashMap<String, Object> map = userService.getUser(userLoginForm);
        if (map != null) {
            User user = (User) map.get("user");
            if (user.getUserType() != UserType.Administrator.getValue()) {
                httpSession.setAttribute(userAttributeName, map);
                httpSession.setMaxInactiveInterval(sessionMaxInactiveInterval);
                return ResponseUtil.ok(map);
            }
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    /*管理员登录*/
    @PostMapping("/adminLogin")
    public Object adminlogin(HttpSession httpSession, @RequestBody @Validated UserLoginForm userLoginForm) {
        HashMap<String, Object> map = userService.getUser(userLoginForm);
        if (map != null) {
            User user = (User) map.get("user");
            if (user.getUserType() == UserType.Administrator.getValue()) {
                httpSession.setAttribute("userInfo", map);
                httpSession.setMaxInactiveInterval(sessionMaxInactiveInterval);
                return ResponseUtil.ok(map);
            }
        }
        return ResponseUtil.badRequest("用户名或密码错误");
    }

    @AuthenticateRequire
    @PostMapping("/getLoginUser")
    public Object getUser(@SessionAttribute(name = "userInfo", required = false) HashMap<String, Object> userInfo) {
        if (userInfo != null) {
            return ResponseUtil.ok(userInfo);
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
        if (userService.userExist(userRegisterForm.getUserName())) {
            return ResponseUtil.badRequest("账号已存在");
        }
        User user = userService.registerClient(userRegisterForm);
        return ResponseUtil.ok(user);
    }

    @AuthenticateRequire
    @PostMapping("/update")
    public Object update(HttpSession session, @RequestBody @Validated UserUpdateForm userUpdateForm) {
        userService.updateUser(userUpdateForm);
        HashMap<String, Object> userInfo = userService.getUserByUUID(userUpdateForm.getUserUuid());
        session.setAttribute(userAttributeName, userInfo);
        session.setMaxInactiveInterval(sessionMaxInactiveInterval);
        return ResponseUtil.ok(true);
    }

}
