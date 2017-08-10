package com.Spring_demo.spring_demo.Implemenntaion;

import com.Spring_demo.spring_demo.Interfaces.MyInterfaces;
import org.springframework.stereotype.Service;

@Service
public class MyImpl implements MyInterfaces{

    @Override
    public Integer add(Integer a, Integer b) {
        int c=a+b;
        return c;
    }
}
