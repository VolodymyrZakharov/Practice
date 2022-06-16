package rest_api.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import rest_api.model.Address;

import java.util.List;

public interface AddressRepo extends JpaRepository<Address, Integer> {
//  public List<Address> findAllByPersonId(Integer integer);

    //JPQL
    @Query("select a from Address a where a.person.id=?1")
    List<Address> returnAllByPersonId(Integer integer);
}
