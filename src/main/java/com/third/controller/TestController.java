package com.third.controller;

import com.third.pojo.TestClass;
import com.third.service.TestService;
import com.third.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    TestService testService;
    @RequestMapping("test")
    public Object test(){
        TestClass test1 = new TestClass();
        test1 = testService.test();
        return test1;
    }
}
