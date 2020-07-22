package com.didisapce01.chapter021;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class Chapter021Application {

    public static void main(String[] args) {
        SpringApplication.run(Chapter021Application.class, args);
    }

}
