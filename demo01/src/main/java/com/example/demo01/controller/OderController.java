package com.example.demo01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @ResponseBody
    @GetMapping("query/{id}")
    public String queryOrderById(@PathVariable("id") String id){
        return "success" + id;
    }

}
