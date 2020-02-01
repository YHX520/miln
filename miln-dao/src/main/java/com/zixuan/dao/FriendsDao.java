package com.zixuan.dao;


import com.zixuan.baseDao.BaseDao;
import com.zixuan.domain.FriendModel;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

@MapperScan
public interface FriendsDao extends BaseDao<FriendModel> {

    ///获取朋友列表
    List<FriendModel> findFriendsByUserId(String userId);

}
