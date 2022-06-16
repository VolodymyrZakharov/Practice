package rest_api.service;

import org.springframework.stereotype.Service;
import rest_api.dto.AddressDto;
import rest_api.model.Address;
import rest_api.model.Person;
import rest_api.repo.AddressRepo;
import rest_api.repo.PersonRepo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AddressService {
    private final AddressRepo addressRepo;
    private final PersonRepo personRepo;

    public AddressService(AddressRepo addressRepo, PersonRepo personRepo) {
        this.addressRepo = addressRepo;
        this.personRepo = personRepo;
    }

    public AddressDto get(Integer id) {
        return addressRepo.findById(id)
                .map(this::mapAddressToDto)
                .orElseThrow();
    }

    private AddressDto mapAddressToDto(Address address) {
        return new AddressDto(
                address.getId(),
                address.getAddress(),
                address.getZip(),
                address.getCity(),
                address.getCountry(),
                address.getPerson().getId()
        );
    }

    public AddressDto create(AddressDto addressDto) {
        Person person = personRepo.findById(addressDto.getPersonId()).orElseThrow();

        Address address = new Address(
                addressDto.address,
                addressDto.zip,
                addressDto.city,
                addressDto.country,
                person
        );
        return mapAddressToDto(addressRepo.save(address));
    }

    public void edit(AddressDto addressDto) {
        Address address = addressRepo.findById(addressDto.id).orElseThrow();

        address.setCity(addressDto.city);
        address.setCountry(addressDto.country);
        address.setZip(addressDto.zip);
        address.setAddress(addressDto.address);

        addressRepo.save(address);
    }

    public void remove(int id) {
        addressRepo.deleteById(id);
    }

    public List<AddressDto> getAllByPersonId(Optional<Integer> personId) {
        List<Address> addresses;
        if (personId.isPresent())
            addresses = addressRepo.returnAllByPersonId(personId.get());
        else
            addresses = addressRepo.findAll();

        return addresses.stream()
                .map(this::mapAddressToDto)
                .collect(Collectors.toList());
    }
}
