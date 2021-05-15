package com.ultradev.springaop.service;

import com.ultradev.springaop.advice.LogArgument;
import com.ultradev.springaop.advice.LogExecutionTime;
import com.ultradev.springaop.model.Message;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @LogExecutionTime
    @LogArgument
    public Message testMethod()
    {
        return new Message("hello");
    }
}
