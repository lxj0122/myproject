package com.ssm.controller;

import com.ssm.entity.user.Login;
import com.ssm.entity.user.Register;
import com.ssm.service.UserService;
import com.ssm.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: lxj
 * Date: 2018/2/9
 * Time: 15:10
 */
@Controller
@ResponseBody
@RequestMapping(value = "/user",method = RequestMethod.POST)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 用户注册
     * @param register
     * @return
     */
    @RequestMapping(value="/register")
    public Result register(@RequestBody @Valid Register register){
        return userService.saveUser(register);
    }

    /**
     * 用户登陆
     * @param map
     * @return
     */
    @RequestMapping(value="/login")
    public Result login(@RequestBody @Valid  Login login){
        return userService.login(login);
    }
}
