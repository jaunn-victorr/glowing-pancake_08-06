package main.java.appspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

@Controller 
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("mensagem", "eai Cambada!!!");
        return "/home/index";
    } 
}