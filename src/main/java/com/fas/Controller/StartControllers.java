package com.fas.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartControllers {
    @RequestMapping("/home")
    public String view2()
    {
        return "home";
    }

    @RequestMapping("/contact")
    public String view3()
    {
        return "contact";
    }
    @RequestMapping("")
    public String ssa()
    {
        return "index";
    }
}
