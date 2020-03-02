package com.example.exerc403_teacherstudent;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/student")
    public String student(){
        return "student";
    }

    @RequestMapping("/teacher")
    public String teacher(){
        return "teacher";
    }


}
