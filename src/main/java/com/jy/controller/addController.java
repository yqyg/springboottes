package com.jy.controller;

import com.jy.service.AddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class addController {

    @Autowired
    private AddUserService addService;
    @GetMapping("/add")
    public void add(){
        List<String> add = addService.addUser();

        for (Object list:add) {
            System.out.println(list);
        }
    }
}
