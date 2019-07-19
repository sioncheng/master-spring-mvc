package com.github.sioncheng.master.springmvc.profile;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.Locale;

@Controller
public class ProfileController {

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String displayProfile(ProfileForm profileForm) {
        System.out.println(LocalDate.now().toString());
        return "profile/profilePage.html";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String saveProfile(ProfileForm profileForm) {
        System.out.println("============ ProfileController.saveProfile ==========");
        return "redirect:/profile";
    }


    @ModelAttribute("dateFormat")
    public String localeFormat(Locale locale) {
        return CNLocalDateFormatter.getPattern(locale);
    }


    @ExceptionHandler(Throwable.class)
    public ModelAndView handleException(Throwable throwable) {
        System.out.println("========== handle exception ===========");
        System.out.println(throwable.getMessage());
        ModelAndView modelAndView = new ModelAndView("profile/error.html");
        modelAndView.addObject("message", throwable.getMessage());
        return modelAndView;
    }
}
