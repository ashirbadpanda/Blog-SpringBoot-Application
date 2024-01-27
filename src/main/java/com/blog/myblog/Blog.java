package com.blog.myblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class Blog {
    @GetMapping({"/index","/"})
    public String getIndex(Model model) {
        return "index";
    }
    
}
