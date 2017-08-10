package com.Spring_demo.spring_demo.controller;

import com.Spring_demo.spring_demo.Implemenntaion.MyImpl;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import sun.jvm.hotspot.debugger.proc.arm.ProcARMThread;

import java.util.HashMap;
import java.util.Map;

@RestController
public class MyController {

    @Autowired
    MyImpl myimpl;

    @GetMapping(value = "/getsum/{a}/{b}")
    Integer add(@PathVariable Integer a,@PathVariable Integer b)
    {
        return  a+b;
    }

    @GetMapping(value = "/getresult/{a}/{b}")
    public ResponseEntity<?> getResult(@PathVariable Integer a,@PathVariable Integer b)
    {
        Integer data=myimpl.add(a,b);

        Map<String ,Object> map = new HashMap();
        map.put("value",data);

        ResponseEntity<?> entity=new ResponseEntity(map, HttpStatus.OK);

       // ResponseEntity<?> entity = ResponseEntity.ok(data);
         return  entity;

    }

}
