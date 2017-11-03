package hu.unideb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CreatorController {


    @RequestMapping(value = "/keszitok")
    public String displayCreatorPage(Model model){
        System.out.println("CreatorControllers.displayCreatorPage");
        return "forward:assets/keszitok.jsp";
    }

    /*
    @RequestMapping(value = "/keszitok", method = RequestMethod.POST)
    public String displayCreatorPage(Model model){
        System.out.println("dfasdfasdfasdfasdfasdfasdfas");
        return "keszitok";
    }*/
}
