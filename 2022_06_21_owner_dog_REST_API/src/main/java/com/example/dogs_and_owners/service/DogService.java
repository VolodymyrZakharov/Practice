package com.example.dogs_and_owners.service;

import com.example.dogs_and_owners.dto.DogRequestDTO;
import com.example.dogs_and_owners.dto.DogResponseDTO;
import com.example.dogs_and_owners.dto.OwnerRequestDTO;

import java.util.List;

public interface DogService {

    void createDog(DogRequestDTO request);

    DogResponseDTO getDogById(long id);

    List<DogResponseDTO> getAllDogs();

    List<DogResponseDTO> getAllUnregisteredDogs();
}
