package com.jy.controller;


import com.jy.entity.User;
import com.jy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("user")
@Api(tags = "用户管理")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("select")
    @ResponseBody
    @ApiOperation("id查询")
    public String user(){
        User user = userService.select(Long.parseLong("1"));
        System.out.println(user);
        return "成功";
    }




}
