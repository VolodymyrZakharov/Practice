package com.example.spring_web.persons.service;

import com.example.spring_web.persons.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PersonsService {

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "";
    }

    @GetMapping("/new-person")
    public String newPerson(Model model){
        model.addAttribute("person", new Person());
        return "edit-person";
    }
}
