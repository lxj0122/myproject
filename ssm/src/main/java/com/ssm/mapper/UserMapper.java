package com.ssm.mapper;

import com.ssm.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:40
 */
@Mapper
public interface UserMapper {
    User selectUser(long userId);
}
