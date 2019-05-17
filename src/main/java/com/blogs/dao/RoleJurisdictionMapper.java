package com.blogs.dao;

import com.blogs.bean.RoleJurisdiction;
import com.blogs.bean.RoleJurisdictionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleJurisdictionMapper {
    long countByExample(RoleJurisdictionExample example);

    int deleteByExample(RoleJurisdictionExample example);

    int deleteByPrimaryKey(Integer roleJurisdictionId);

    int insert(RoleJurisdiction record);

    int insertSelective(RoleJurisdiction record);

    List<RoleJurisdiction> selectByExample(RoleJurisdictionExample example);

    RoleJurisdiction selectByPrimaryKey(Integer roleJurisdictionId);

    int updateByExampleSelective(@Param("record") RoleJurisdiction record, @Param("example") RoleJurisdictionExample example);

    int updateByExample(@Param("record") RoleJurisdiction record, @Param("example") RoleJurisdictionExample example);

    int updateByPrimaryKeySelective(RoleJurisdiction record);

    int updateByPrimaryKey(RoleJurisdiction record);
}