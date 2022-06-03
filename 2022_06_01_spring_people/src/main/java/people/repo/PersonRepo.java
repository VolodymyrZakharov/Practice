package people.repo;

import org.springframework.stereotype.Repository;
import people.model.Person;

import java.util.*;

@Repository
public class PersonRepo {

    private int currentId = 0;
    private final Map<Integer, Person> source = new HashMap<>();

    /**
     * saves a new person or edit the old person
     *
     * @param person new person or existing person
     * @return saved person with assigned id
     */
    public Person save(Person person) {
        if (person.getId() == null) {
            person.setId(++currentId);
        }
        source.put(person.getId(), person);
        return person;
    }

    /**
     * removes the person with this id and returns it
     *
     * @param id
     * @return
     */
    public Person delete(int id) {
        Person res = source.get(id);
        source.remove(id);
        return res;
    }

    /**
     * finds the person with this id and returns, if exists. Otherwise returns empty optional.
     *
     * @param id
     * @return
     */
    public Optional<Person> find(int id) {
        return Optional.ofNullable(source.get(id));
    }

    /**
     * @return all found persons
     */
    public List<Person> findAll() {
        return new ArrayList(source.values());
    }
}
