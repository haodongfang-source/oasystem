package com.hdf.oasys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hdf.oasys.mapper")
public class OaSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(OaSysApplication.class, args);
    }

}
