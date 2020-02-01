package com.zixuan.service;


import com.zixuan.dao.UserDao;
import com.zixuan.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService  {

    @Autowired
    UserDao userDao;



    public List<User> queryData() {
        return null;
    }


    /**
     * 通过Id获取用户数据
     * @param id
     * @return
     */
    public User findDataById(String id) {
        return  userDao.findDataById(id);
    }

    /**
     *通过userName获取用户信息
     * @param userName
     * @return
     */
    public User findDataByUserName(String userName) {
        return  userDao.getUserByUserName(userName);
    }

    public boolean deleteData(String id) {
        return false;
    }


    public User UpdateData(User object) {
        return null;
    }


    public User InsertData(User object) {
        return null;
    }
}
