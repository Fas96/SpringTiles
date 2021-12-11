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
    public String showIndex()
    {
        return "index";
    }

    @RequestMapping("/audio")
    public String showAudio()
    {
        return "contact";
    }

    @RequestMapping("/grade")
    public String showGrade()
    {
        return "contact";
    }


    @RequestMapping("/exams")
    public String showExams()
    {
        return "contact";
    }

    @RequestMapping("/mock")
    public String showMock()
    {
        return "contact";
    }

    @RequestMapping("/email")
    public String showEmail()
    {
        return "contact";
    }

}
