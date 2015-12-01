package com.elangzhi.base.dao;

import com.elangzhi.base.model.Settings;

public interface SettingsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Settings record);

    int insertSelective(Settings record);

    Settings selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Settings record);

    int updateByPrimaryKey(Settings record);
}