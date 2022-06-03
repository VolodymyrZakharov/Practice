package com.example.spring_web.persons.repo;

import com.example.spring_web.persons.model.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class PersonsRepo {

    private int currentId = 0;
    private final Map<Integer, Person> source = new HashMap<>();

    /**
     * save a new person or edits the old person
     *
     * @param person new person
     * @return saved new person with assigned id
     */
    public Person save(Person person) {
        return null;
    }

    /**
     * remove the person with this id and returns it
     *
     * @param id
     * @return
     */
    public Person delete(int id) {
        return null;
    }

    /**
     * fonds the peron with this id and return if exists. Otherwise retutns empty optionals
     *
     * @param id
     * @return
     */
    public Optional<Person> find(int id) {
        return null;
    }
}
