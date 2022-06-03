package com.example.spring_mvc.controller;

import com.example.spring_mvc.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class HelloController {

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    // to return a simple string in the http response body
    @ResponseBody
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("/hellow")
    @ResponseBody
    public String hello_2() {
        return "Hello all";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String hello(@PathVariable String name) {
        return "hello " + name;
    }

    @GetMapping("/hello/thymeleaf/{name}")
    public String helloThymeleaf(@PathVariable String name, Model model) {
        model.addAttribute("nameToShow", name);
        return "HtmlFile";
    }

    @PostMapping("/post-hello")
    @ResponseBody
    public String postHello(@ModelAttribute Person person) {
        return "name: " + person.getName() + " lastName: " + person.getLastName();
    }

    @GetMapping("/hello/homework")
    public String getPersons(Model model) {
        model.addAttribute("personsList", personsList);
        return "Persons";
    }

    @GetMapping("/persons-json")
    @ResponseBody
    public List<Person> getPersonsJSon(Model model) {
        return personsList;
    }

    List<Person> personsList = List.of(
            new Person("Vasya ", "Vasin"),
            new Person("Petya ", "Petin"),
            new Person("Vova ", "Vovin"));

}
