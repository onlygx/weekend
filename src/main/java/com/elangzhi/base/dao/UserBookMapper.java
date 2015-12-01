package com.elangzhi.base.dao;

import com.elangzhi.base.model.UserBook;

public interface UserBookMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserBook record);

    int insertSelective(UserBook record);

    UserBook selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(UserBook record);

    int updateByPrimaryKey(UserBook record);
}