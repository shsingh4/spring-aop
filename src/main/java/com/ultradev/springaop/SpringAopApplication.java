package com.ultradev.springaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.util.StringUtils;

import static org.springframework.util.StringUtils.*;

@SpringBootApplication
@EnableAspectJAutoProxy
public class SpringAopApplication {
    public static void main(String[] args) {

        SpringApplication.run(SpringAopApplication.class, args);
        System.out.println(commaDelimitedListToStringArray("shashank,singh"));

    }

}
