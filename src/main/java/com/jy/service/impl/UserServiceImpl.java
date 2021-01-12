package com.jy.service.impl;

import com.jy.entity.User;
import com.jy.mapper.UserMapper;
import com.jy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Transactional
    public User select(Long id) {

        User user = userMapper.selectpp(id);
        return user;
    }



//************************************************************************************
    @Cacheable(key = "user")  //作用在查询上
    public User selectUser(){
        User user = new User();
        return user;
    }
//  eq ==    ge >=    gt >   le <=   lt <
    @CachePut(key = "#user.id" ,condition ="#user.id ge 5" )  //作用在插入和更新中
    public User UpdateInsetr(User user){
        return user;
    }

    /**
     * allEntries = true ：删除整个缓存区的所有值，此时指定的key无效
     * beforeInvocation = true ：默认false，表示调用方法之后删除缓存数据；true时，在调用之前删除缓存数据(如方法出现异常)
     */
    @CacheEvict(key = "#user.id")  //作用在删除中
    public User delete(User user){
        return user;
    }




}
