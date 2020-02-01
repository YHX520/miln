package com.zixuan.milnweb.controller;

import com.zixuan.domain.*;
import com.zixuan.service.UserService;
import exception.BaseException;

import io.swagger.annotations.ApiModelProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import resultutils.Result;
import resultutils.ResultUtils;


import java.util.Map;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @UserLoginToken
    @GetMapping("/userInfo/{userId}")
    @ApiModelProperty(name = "获取用户信息")
    public Result<User> GetUserInfo(@PathVariable(value = "userId") String userId) {

        User user = userService.findDataById(userId);

        return new ResultUtils().Success(user);

    }

    @PassToken
    @PostMapping("/token")
    @ApiModelProperty(name = "获取token")
    public Result<Token> GetToken(@RequestBody Map params) {

        String username = (String) params.get("username");
        String password = (String) params.get("password");

        if (username == null || username.isEmpty()) {
            throw new BaseException(-1, "请填写用户名");
        }

        if (password == null || password.isEmpty()) {
            throw new BaseException(-1, "请填写密码");
        }

        User user = userService.findDataByUserName(username);

        if (user != null && password.equals(user.getPassword())) {
            Token token = new Token();
            User user1 = userService.findDataByUserName(username);
            token.setUserId(user1.getUserId());
            token.setToken(TokenUtils.create(user1));
            return ResultUtils.Success(token);
        } else {
            return ResultUtils.Fail(-1, "账号或密码错误");
        }

    }


}
