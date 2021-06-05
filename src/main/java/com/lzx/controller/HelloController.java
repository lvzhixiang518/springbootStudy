package com.lzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class HelloController {
    @RequestMapping("/test")
    //@ResponseBody
    public String hello(Model model){
        model.addAttribute("msg","<h1>nihao a</h1>");
        model.addAttribute("users", Arrays.asList("lzx","zhangsan"));
        return "test";
    }
}
