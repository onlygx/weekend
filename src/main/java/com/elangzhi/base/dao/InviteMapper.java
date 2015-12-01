package com.elangzhi.base.dao;

import com.elangzhi.base.model.Invite;

public interface InviteMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Invite record);

    int insertSelective(Invite record);

    Invite selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Invite record);

    int updateByPrimaryKey(Invite record);
}