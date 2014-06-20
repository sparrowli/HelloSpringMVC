package com.sparrow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello.html")
    public String helloPage(){
        return "hello";
    }
}
