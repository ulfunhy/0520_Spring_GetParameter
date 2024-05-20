package kr.hs.study.GetParameter.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//@Controller
@Component
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "index";
    }
}
