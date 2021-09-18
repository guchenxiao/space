package com.x.space;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.x.space.mapper")
public class SpaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpaceApplication.class, args);
    }

}
