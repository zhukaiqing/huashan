package com.zhu.springboothelloword.hellocontrol;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class helloword {

   @ResponseBody
    @RequestMapping("/hello")
    public String hello()
    {

        return "hello word";
    }
}
