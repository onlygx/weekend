package com.elangzhi.base.dao;

import com.elangzhi.base.model.Integral;

public interface IntegralMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Integral record);

    int insertSelective(Integral record);

    Integral selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Integral record);

    int updateByPrimaryKey(Integral record);
}