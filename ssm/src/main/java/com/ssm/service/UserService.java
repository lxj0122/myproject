package com.ssm.service;

import com.ssm.entity.user.Login;
import com.ssm.entity.user.Register;
import com.ssm.entity.user.User;
import com.ssm.mapper.UserMapper;
import com.ssm.utils.MD5;
import com.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:11
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Result saveUser(Register register){
        try {
            User user=new User();
            user.setUserName(register.getName());
            user.setUserPwd(MD5.MD5Password(register.getPwd()));
            user.setUserSex("M");
            user.setUserMobile("123456789123");
            //验证用户是否已经存在
            User userInfo= userMapper.selectUserInfo(user);
            if(userInfo!=null){
                return  new Result("fail","用户已经存在");
            }
            userMapper.insertUser(user);
        }catch (Exception e){
            e.printStackTrace();
            return  new Result("fail","注册用户失败");
        }
        return new Result("success","注册用户成功");
    }

    public Result login(Login login){
        User user=new User();
        user.setUserName(login.getUserName());
        User userInfo=userMapper.selectUserInfo(user);
        if(userInfo==null){
            return new Result("fail","用户不存在");
        }
        if(!MD5.MD5Password(login.getPassword()).equals(userInfo.getUserPwd())){
            return new Result("fail","密码错误");
        }
        return  new Result("success","登陆成功");
    }
}
