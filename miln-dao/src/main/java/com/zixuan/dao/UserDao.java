package com.zixuan.dao;



import com.zixuan.baseDao.BaseDao;

import com.zixuan.domain.User;
import org.mybatis.spring.annotation.MapperScan;

@MapperScan
public interface UserDao extends BaseDao<User> {

    public String getUserName(String id);

    public  User getUserByUserName(String userName);

}
