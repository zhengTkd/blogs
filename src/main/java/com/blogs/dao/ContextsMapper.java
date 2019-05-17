package com.blogs.dao;

import com.blogs.bean.Contexts;
import com.blogs.bean.ContextsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ContextsMapper {
    long countByExample(ContextsExample example);

    int deleteByExample(ContextsExample example);

    int deleteByPrimaryKey(Integer contextsId);

    int insert(Contexts record);

    int insertSelective(Contexts record);

    List<Contexts> selectByExampleWithBLOBs(ContextsExample example);

    List<Contexts> selectByExample(ContextsExample example);

    Contexts selectByPrimaryKey(Integer contextsId);

    int updateByExampleSelective(@Param("record") Contexts record, @Param("example") ContextsExample example);

    int updateByExampleWithBLOBs(@Param("record") Contexts record, @Param("example") ContextsExample example);

    int updateByExample(@Param("record") Contexts record, @Param("example") ContextsExample example);

    int updateByPrimaryKeySelective(Contexts record);

    int updateByPrimaryKeyWithBLOBs(Contexts record);

    int updateByPrimaryKey(Contexts record);
}