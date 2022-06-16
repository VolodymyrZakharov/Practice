package rest_api.service;

import org.springframework.stereotype.Service;
import rest_api.model.Person;
import rest_api.repo.PersonRepo;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    private final PersonRepo personRepo;

    public PersonService(PersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public Person save(Person person) {
        return personRepo.save(person);
    }

    public Person remove(int id) {
        Person person = get(id);
        personRepo.delete(person);
        return person;
    }

    public List<Person> getAllByNameAndLastName(Optional<String> name, Optional<String> lastName) {
        if (name.isPresent() && lastName.isPresent()) {
            return personRepo.findAllByNameIgnoreCaseAndLastnameIgnoreCase(name.get(), lastName.get());
        } else if (name.isPresent()) {
            return personRepo.findAllByNameIgnoreCase(name.get());
        } else if (lastName.isPresent()) {
            return personRepo.findAllByLastnameIgnoreCase(lastName.get());
        } else return personRepo.findAll();
    }

    public Person get(int id) {
        return personRepo.findById(id).orElseThrow();
    }
}