package com.example.dogs_and_owners.controller;

import com.example.dogs_and_owners.dto.DogRequestDTO;
import com.example.dogs_and_owners.dto.DogResponseDTO;
import com.example.dogs_and_owners.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    DogService dogService;

    @PostMapping("/dogs")
    public void createDog(@RequestBody DogRequestDTO request) {
        dogService.createDog(request);
    }

    @GetMapping("/dogs")
    public List<DogResponseDTO> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/dogs/{id}")
    public DogResponseDTO getDogById(@PathVariable("id") long id) {
        return dogService.getDogById(id);
    }

    @GetMapping("/dogs/unregistered")
    public List<DogResponseDTO> getAllUnregisteredDogs() {
        return dogService.getAllUnregisteredDogs();
    }
}
