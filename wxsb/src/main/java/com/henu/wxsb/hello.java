package com.henu.wxsb;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "hello SpringBoot";
    }
}