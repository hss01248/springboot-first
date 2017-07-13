package com.hss01248.ps.mapper;

import com.hss01248.ps.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by Administrator on 2017/7/13.
 */
@Mapper
public interface PersonMapper {
    @Select("SELECT * FROM PERSON WHERE id = #{id}")
    Person getById(@Param("id") int id);

}
