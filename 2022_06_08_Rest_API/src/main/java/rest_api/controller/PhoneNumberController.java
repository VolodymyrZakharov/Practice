package rest_api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import rest_api.dto.PhoneNumberDto;
import rest_api.service.PhoneNumberService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/phone-numbers")
public class PhoneNumberController {

    private final PhoneNumberService phoneNumberService;

    public PhoneNumberController(PhoneNumberService phoneNumberService) {
        this.phoneNumberService = phoneNumberService;
    }

    /**
     * Get the phoneNumber by id
     */
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public PhoneNumberDto get(@PathVariable Integer id) {
        return phoneNumberService.get(id);
    }

    /**
     * Greate a new phoneNumber
     */
    @PostMapping
    public PhoneNumberDto create(@RequestBody PhoneNumberDto phoneNumberDto) {
        return phoneNumberService.create(phoneNumberDto);
    }

    @PutMapping
    public void edit(@RequestBody PhoneNumberDto phoneNumberDto) {
        phoneNumberService.edit(phoneNumberDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        phoneNumberService.remove(id);
    }

    @GetMapping
    public List<PhoneNumberDto> getAll(@RequestParam(required = false) Optional<Integer> personId) {
        return phoneNumberService.getAllByPersonId(personId);
    }
}
