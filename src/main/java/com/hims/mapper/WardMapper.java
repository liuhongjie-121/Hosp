package com.hims.mapper;

import com.hims.pojo.Ward;

public interface WardMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ward record);

    int insertSelective(Ward record);

    Ward selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ward record);

    int updateByPrimaryKey(Ward record);
}