package com.elangzhi.base.dao;

import com.elangzhi.base.model.BookLabel;

public interface BookLabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(BookLabel record);

    int insertSelective(BookLabel record);

    BookLabel selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(BookLabel record);

    int updateByPrimaryKey(BookLabel record);
}