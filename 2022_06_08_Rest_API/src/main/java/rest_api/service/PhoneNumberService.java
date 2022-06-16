package rest_api.service;

import org.springframework.stereotype.Service;
import rest_api.dto.PhoneNumberDto;
import rest_api.model.Person;
import rest_api.model.PhoneNumber;
import rest_api.repo.PersonRepo;
import rest_api.repo.PhoneNumberRepo;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PhoneNumberService {

    private final PersonRepo personRepo;
    private final PhoneNumberRepo phoneNumberRepo;

    public PhoneNumberService(PersonRepo personRepo, PhoneNumberRepo phoneNumberRepo) {
        this.personRepo = personRepo;
        this.phoneNumberRepo = phoneNumberRepo;
    }

    public PhoneNumberDto get(Integer id) {
        return phoneNumberRepo.findById(id).map(this::mapPhoneNumberToDto).orElseThrow();
    }

    public PhoneNumberDto mapPhoneNumberToDto(PhoneNumber phoneNumber) {
        return new PhoneNumberDto(
                phoneNumber.getId(),
                phoneNumber.getCountryCode(),
                phoneNumber.getPhoneNumber(),
                phoneNumber.getPerson().getId()
        );
    }

    public PhoneNumberDto create(PhoneNumberDto phoneNumberDto) {
        Person person = personRepo.findById(phoneNumberDto.id).orElseThrow();

        PhoneNumber phoneNumber = new PhoneNumber(
                phoneNumberDto.countryCode,
                phoneNumberDto.phoneNumber,
                person
        );
        return mapPhoneNumberToDto(phoneNumberRepo.save(phoneNumber));
    }

    public void edit(PhoneNumberDto phoneNumberDto) {
        PhoneNumber phoneNumber = phoneNumberRepo.findById(phoneNumberDto.id).orElseThrow();

        phoneNumber.setCountryCode(phoneNumberDto.countryCode);
        phoneNumber.setPhoneNumber(phoneNumberDto.phoneNumber);

        phoneNumberRepo.save(phoneNumber);
    }

    public void remove(int id) {
        phoneNumberRepo.deleteById(id);
    }

    public List<PhoneNumberDto> getAllByPersonId(Optional<Integer> personId) {
        List<PhoneNumber> phoneNumbers;
        if (personId.isPresent())
            phoneNumbers = phoneNumberRepo.findAllByPersonId(personId.get());
        else phoneNumbers = phoneNumberRepo.findAll();

        return phoneNumbers.stream().map(this::mapPhoneNumberToDto).collect(Collectors.toList());
    }
}
