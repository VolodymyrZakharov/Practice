package com.example.dogs_and_owners.service.impl;

import com.example.dogs_and_owners.dto.DogRequestDTO;
import com.example.dogs_and_owners.dto.DogResponseDTO;
import com.example.dogs_and_owners.entity.Dog;
import com.example.dogs_and_owners.repository.DogRepository;
import com.example.dogs_and_owners.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class DogServiceImpl implements DogService {

    @Autowired
    private DogRepository dogRepository;

    @Override
    public void createDog(DogRequestDTO request) {
        Dog dog = Dog.builder()
                .nickName(request.getNickName())
                .breed(request.getBreed())
                .dateOfBirth(request.getDateOfBirth())
                .owner(null)
                .registrationDate(LocalDate.now()).build();

        dogRepository.save(dog);
    }

    @Override
    public DogResponseDTO getDogById(long id) {
        Dog dog = dogRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        Long ownerId;
        if (dog.getOwner() == null)
            ownerId = null;
        else ownerId = dog.getOwner().getId();

        return DogResponseDTO.builder()
                .id(dog.getId())
                .nickName(dog.getNickName())
                .breed(dog.getBreed())
                .dateOfBirth(dog.getDateOfBirth())
                .ownerId(ownerId)
                .registrationDate(dog.getRegistrationDate())
                .build();
    }

    @Override
    public List<DogResponseDTO> getAllDogs() {
        List<Dog> list = dogRepository.findAll();
        return list.stream()
                .map(Dog::getId)
                .map(this::getDogById).collect(Collectors.toList());
    }

    @Override
    public List<DogResponseDTO> getAllUnregisteredDogs() {
        return getAllDogs().stream()
                .filter(dog -> dog.getOwnerId() == null)
                .collect(Collectors.toList());
    }
}
