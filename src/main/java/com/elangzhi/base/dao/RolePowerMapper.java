package com.elangzhi.base.dao;

import com.elangzhi.base.model.RolePower;

public interface RolePowerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RolePower record);

    int insertSelective(RolePower record);

    RolePower selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RolePower record);

    int updateByPrimaryKey(RolePower record);
}