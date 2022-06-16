package rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rest_api.model.Person;
import rest_api.service.PersonService;
import java.util.List;
import java.util.Optional;

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
    public void delete(@PathVariable int id) {
        personService.remove(id);
    }

    @GetMapping
    public List<Person> getAll(@RequestParam(required = false) Optional<String> name,
                               @RequestParam(required = false) Optional<String> lastName) {
        return personService.getAllByNameAndLastName(name, lastName);
    }

    // TODO create an endpoint, finding all persons with such a name. /api/persons?name=Vasya&lastname=Vasin
    // TODO create an endpoint, finding all persons with such a lastname
    // TODO create an endpoint finding all persons with the age larger some query parameter

}