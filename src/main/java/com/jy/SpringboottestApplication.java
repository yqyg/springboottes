package com.jy;

import com.jy.config.ApplicationEventListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringboottestApplication.class, args);
    }

    /**
     * 配合yml文件实现监听
     */
//    public static void main(String[] args) {
//        SpringApplication app = new SpringApplication(SpringboottestApplication.class);
//        app.addListeners(new ApplicationEventListener());
//        app.run(args);
//    }

}
