package rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import rest_api.model.PhoneNumber;

import java.util.List;

public interface PhoneNumberRepo extends JpaRepository<PhoneNumber, Integer> {

    public List<PhoneNumber> findAllByPersonId(Integer id);
}
