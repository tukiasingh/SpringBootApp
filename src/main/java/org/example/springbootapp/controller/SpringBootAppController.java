package org.example.springbootapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/news")
public class SpringBootAppController {

    @GetMapping(path="/headlines")
    @ResponseBody
    public String newsHeadlines() {
        return "Crypto Analyst Predicts Dogecoin Price Will Hit $1 If This Happens";
    }
}
