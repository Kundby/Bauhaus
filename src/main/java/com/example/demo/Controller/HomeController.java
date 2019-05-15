package com.example.demo.Controller;


import com.example.demo.Service.KundeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    KundeService kundeService;

    @GetMapping("/")
    public String index(){
        return "home/index";
    }
}
