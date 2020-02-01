package com.zixuan.baseDao;



import org.apache.ibatis.annotations.Mapper;
import tk.mybatis.mapper.common.ConditionMapper;
import tk.mybatis.mapper.common.IdsMapper;
import tk.mybatis.mapper.common.MySqlMapper;

import java.util.List;

public interface BaseDao<T> extends Mapper, MySqlMapper<T>, ConditionMapper<T>, IdsMapper<T> {
    List<T> queryData();

    T findDataById(String id);

    boolean deleteData(String id);

    T UpdateData(T object);

    T InsertData(T object);
}
