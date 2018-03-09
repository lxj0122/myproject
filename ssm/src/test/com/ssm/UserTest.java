package com.ssm;

import com.ssm.entity.user.User;
import com.ssm.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:46
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring/spring-*.xml")
public class UserTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public  void userTest(){
        User user=new User();
        user.setUserId(1);
        User u=userMapper.selectUser(1);
        System.out.println("用户名："+u.getUserName());
    }
}
