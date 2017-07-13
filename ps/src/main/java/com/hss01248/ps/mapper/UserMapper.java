package com.hss01248.ps.mapper;

import com.hss01248.ps.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by Administrator on 2017/7/13.
 */
@Mapper
public interface  UserMapper {

    User findUserById(Integer id);
}
