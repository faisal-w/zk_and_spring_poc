package com.wira.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by faisal on 7/5/2017.
 */
@Controller
@RequestMapping("/")
public class MainController {

    @RequestMapping(value = {"","/","index"},method = RequestMethod.GET)
    public String index(){
        return "zul/home.zul";
    }

}
