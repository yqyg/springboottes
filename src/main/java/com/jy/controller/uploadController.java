package com.jy.controller;


import com.jy.util.RandomStrUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;

/**
 * 文件的上传下载
 */
@Controller
@Api(tags = "文件上传")
@RequestMapping("upload")
public class uploadController {


    @ApiOperation("跳转到index页面")
    @RequestMapping("jump")
    public String jump(){

        return "index";
    }

    @PostMapping("up")
    @ApiOperation("文件上传")
    public String up(MultipartFile mf, HttpSession session) throws Exception{

//      1.得到上传文件的名字
        String old = mf.getOriginalFilename();
//       2.得到Tomcat目录
        String realPath = session.getServletContext().getRealPath("/static/image");
//        3.得到当前日期的"文件夹"名字
        String currentDate = RandomStrUtils.getCurrentDateToStr();
        String replace = realPath.replace("webapp", "resources");
//      4.判断临时文件夹下有没有当前日期的文件夹 （不存在就创建）
//        String newRealPath = realPath+"/"+currentDate;
        String newRealPath = replace+"/"+currentDate;
        File file = new File(newRealPath);
        if (!file.exists()){
            file.mkdir();
        }
//      5.用上传的名字得到一个新名字
        String newName = RandomStrUtils.timeRandom(old);
//      6.构造文件
        File newFile = new File(file, newName);
        mf.transferTo(newFile);

        return "success";
    }
}
