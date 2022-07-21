package com.itheima.dao;

import com.itheima.pojo.CheckItem;
import com.itheima.pojo.CheckItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckItemMapper {
    int countByExample(CheckItemExample example);

    int deleteByExample(CheckItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CheckItem record);

    int insertSelective(CheckItem record);

    List<CheckItem> selectByExample(CheckItemExample example);

    CheckItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CheckItem record, @Param("example") CheckItemExample example);

    int updateByExample(@Param("record") CheckItem record, @Param("example") CheckItemExample example);

    int updateByPrimaryKeySelective(CheckItem record);

    int updateByPrimaryKey(CheckItem record);
}