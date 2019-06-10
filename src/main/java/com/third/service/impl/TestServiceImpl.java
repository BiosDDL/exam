package com.third.service.impl;

import com.third.pojo.TestClass;
import com.third.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    public TestClass test() {
        TestClass testClass = new TestClass();
        testClass.setName("小明");
        return testClass;
    }
}
