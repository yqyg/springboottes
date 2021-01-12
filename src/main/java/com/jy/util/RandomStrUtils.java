package com.jy.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class RandomStrUtils {

    private static SimpleDateFormat time1 = new SimpleDateFormat("yyyyMMddHHmmssSSS");
    private static SimpleDateFormat time2=new SimpleDateFormat("yyyy-MM-dd");
    private static Random random = new Random();


    /**
     * 生成  时间+随机数 文件名
     * @param old
     * @return
     */
    public static String timeRandom(String old){

//        1.得到老文件.后面的文件夹后缀名 如：.jsp   .png
        String suffix = old.substring(old.lastIndexOf("."), old.length());
//        2.4位的随机数1000--10000的数字
        int num = random.nextInt(9000)+1000;
//        3.得到当前时间
        String format = time1.format(new Date());
//        3.时间+_+随机数+后缀名  返回一个新的文件名
        return format+"_"+num+suffix;

    }

//    得到当前日期   去生成"文件夹"名字
    public static String getCurrentDateToStr(){
        return time2.format(new Date());
    }
}
