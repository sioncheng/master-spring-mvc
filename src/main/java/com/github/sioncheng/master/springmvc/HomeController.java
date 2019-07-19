package com.github.sioncheng.master.springmvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    //@ResponseBody
    public String hello(@RequestParam(value = "name", defaultValue = "world") String name,  Model model) {
        model.addAttribute("message", "hello " + name);
        return "resultPage";
    }
}
