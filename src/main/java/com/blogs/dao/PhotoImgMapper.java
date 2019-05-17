package com.blogs.dao;

import com.blogs.bean.PhotoImg;
import com.blogs.bean.PhotoImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PhotoImgMapper {
    long countByExample(PhotoImgExample example);

    int deleteByExample(PhotoImgExample example);

    int deleteByPrimaryKey(Integer photoImgId);

    int insert(PhotoImg record);

    int insertSelective(PhotoImg record);

    List<PhotoImg> selectByExample(PhotoImgExample example);

    PhotoImg selectByPrimaryKey(Integer photoImgId);

    int updateByExampleSelective(@Param("record") PhotoImg record, @Param("example") PhotoImgExample example);

    int updateByExample(@Param("record") PhotoImg record, @Param("example") PhotoImgExample example);

    int updateByPrimaryKeySelective(PhotoImg record);

    int updateByPrimaryKey(PhotoImg record);
}