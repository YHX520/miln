package com.zixuan.milnweb.controller;

import com.zixuan.domain.FriendModel;
import com.zixuan.service.FriendsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import resultutils.Result;
import resultutils.ResultUtils;

import java.util.List;

@RestController
public class FriendsController {

    @Autowired
    FriendsService friendsService;

    @GetMapping("/friends/{userId}")
    public Result<List<FriendModel>> getFriendsByUserId(@PathVariable("userId") String userId) {
        List<FriendModel> friendModels = friendsService.getFriendsListByUserId(userId);
        return ResultUtils.Success(friendModels);
    }

}
