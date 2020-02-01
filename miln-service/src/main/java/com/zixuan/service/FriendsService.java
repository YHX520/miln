package com.zixuan.service;


import com.zixuan.dao.FriendsDao;
import com.zixuan.domain.FriendModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FriendsService {

    @Autowired
    FriendsDao friendsDao;

    public List<FriendModel> getFriendsListByUserId(String userId) {
        return friendsDao.findFriendsByUserId(userId);
    }

}
