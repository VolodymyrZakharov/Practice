package rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rest_api.model.Person;
import rest_api.service.PersonService;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {
    private final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    /**
     * Get the person by id
     */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Person get(@PathVariable Integer id) {
        return personService.get(id);
    }

    /**
     * Greate a new person
     */
    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.save(person);
    }

    @PutMapping
    public void edit(@RequestBody Person person) {
        personService.save(person);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        personService.remove(personService.get(id));
    }

    @GetMapping
    public List<Person> getAll() {
        return personService.getAll();
    }

}
