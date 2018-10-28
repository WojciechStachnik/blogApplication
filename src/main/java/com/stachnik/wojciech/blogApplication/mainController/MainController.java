package com.stachnik.wojciech.blogApplication.mainController;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    public String getIndexPage(){
        return "index";
    }
}
