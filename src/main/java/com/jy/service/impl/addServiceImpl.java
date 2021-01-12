package com.jy.service.impl;

import com.jy.mapper.UserMapper;
import com.jy.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class addServiceImpl implements AddUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<String> addUser() {

        int p=1;
        List<String> arrayList = new ArrayList<>();
        List<String> getsubjectbyterm = userMapper.getsubjectbyterm();

        for (String stu:getsubjectbyterm) {

            List<String> selectbyparam1 = userMapper.selectbyparam(stu);
            for (String li:selectbyparam1) {
                arrayList.add(li);
                System.out.println(p++);
            }

        }



        return arrayList;

    }
}
