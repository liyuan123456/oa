package com.atliyuan.oa.dao;

import com.atliyuan.oa.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 黎源
 * @date 2020/1/7 16:01
 */
@Mapper
public interface UserDao {
    public List<User> selectAllUser();
}
