package com.jy.controller;


import cn.hutool.core.io.file.FileReader;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

/**
 *  读取一个json文档写入数据库
 *  1.导入hutool的工具依赖包
 *  2.导入阿里的JSON依赖包
 */
public class JsonController {

    public static void main(String[] args) {

//        1.导入hutool的工具包，别导错io的了
        FileReader fileReader = new FileReader("F:\\company_all");
//      2.读出文件的所有内容
        String result = fileReader.readString();
//      3.导入阿里的json包，切记 import com.alibaba.fastjson.JSON; 把文件转换为json类型
        JSONObject jb = JSON.parseObject(result);
//      4.resultData是此个json的key，由key获取他所有的value，UserVo是与之json对应的，读取出来放入UserVo
//        List<UserVo> list = JSON.parseArray(jb.get("resultData").toString(),UserVo.class);
//       5.循环拿出值
//        for (UserVo user:list){
//
//        }
    }
}
