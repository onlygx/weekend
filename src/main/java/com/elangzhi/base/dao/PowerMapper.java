package com.elangzhi.base.dao;

import com.elangzhi.base.model.Power;

public interface PowerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Power record);

    int insertSelective(Power record);

    Power selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Power record);

    int updateByPrimaryKey(Power record);
}