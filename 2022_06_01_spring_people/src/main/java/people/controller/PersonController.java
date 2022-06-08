package people.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import people.model.Person;
import people.service.PersonService;

@Controller
public class PersonController {

    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }


    @GetMapping("/")
    public String start() {
        return "forward:/home-page";
    }

    @GetMapping("/home-page")
    public String home(Model model) {
        model.addAttribute("personsList", personService.getAll());
        return "home-page";
    }

    @GetMapping("/new-person")
    public String newPerson(Model model) {
        model.addAttribute("person", new Person());
        return "edit-person";
    }

    @PostMapping("/save-person")
    public String savePerson(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/home-page";
    }

    @GetMapping("/delete-person/{id}")
    public String deletePerson(@PathVariable Integer id) {
        personService.remove(personService.get(id));
        return "redirect:/home-page";
    }

    @GetMapping("/edit-person/{id}")
    public String editPerson(@PathVariable Integer id, Model model) {
        Person person = personService.get(id);
        model.addAttribute("person", person);
        return "edit-person";
    }

    @GetMapping("/show-person/{id}")
    public String showPerson(@PathVariable Integer id, Model model) {
        Person person = personService.get(id);
        model.addAttribute("person", person);
        return "show-person";
    }
}
