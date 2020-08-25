package com.example.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dplStart
 * @create 下午 10:32
 * @Description
 */
@Controller
@RequestMapping("order")
public class OderController {

    @ResponseBody
    @GetMapping
    public String queryAllOrder(){
        return "success";
    }

}
