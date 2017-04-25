package com.ykk;

import com.ykk.DictItem;

public interface DictItemMapper {
    int deleteByPrimaryKey(Long itemId);

    int insert(DictItem record);

    int insertSelective(DictItem record);

    DictItem selectByPrimaryKey(Long itemId);

    int updateByPrimaryKeySelective(DictItem record);

    int updateByPrimaryKey(DictItem record);
}