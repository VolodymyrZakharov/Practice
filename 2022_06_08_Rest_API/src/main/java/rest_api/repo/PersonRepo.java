package rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_api.model.Person;

import java.util.List;

public interface PersonRepo extends JpaRepository<Person, Integer> {

    public List<Person> findAllByNameIgnoreCase(String name);

    public List<Person> findAllByLastnameIgnoreCase(String lastName);

    public List<Person> findAllByNameIgnoreCaseAndLastnameIgnoreCase(String name, String lastName);
}
