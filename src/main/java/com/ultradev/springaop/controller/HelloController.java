package com.ultradev.springaop.controller;

import com.ultradev.springaop.advice.LogExecutionTime;
import com.ultradev.springaop.model.Message;
import com.ultradev.springaop.service.HelloService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public ResponseEntity<Message> sayHello()
    {
        log.info("executing services");
        return new ResponseEntity<>(helloService.testMethod(), HttpStatus.OK);
    }

}
