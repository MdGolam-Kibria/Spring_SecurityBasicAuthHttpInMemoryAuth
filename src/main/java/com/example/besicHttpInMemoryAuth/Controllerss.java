package com.example.besicHttpInMemoryAuth;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controllerss {
    @RequestMapping("/hello")
    public String get(){
        System.out.println("say hello spring boot");

        return "hello";
    }
}
