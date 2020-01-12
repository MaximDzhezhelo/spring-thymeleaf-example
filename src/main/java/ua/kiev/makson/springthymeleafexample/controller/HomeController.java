package ua.kiev.makson.springthymeleafexample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String getExampleHTML(Model model) {
        model.addAttribute("title", "Win");
        model.addAttribute("description", "<strong>Thymeleaf</strong> tutorial");
        return "Home.html";
    }

}