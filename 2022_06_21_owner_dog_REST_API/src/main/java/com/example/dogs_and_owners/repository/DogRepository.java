package com.example.dogs_and_owners.repository;

import com.example.dogs_and_owners.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DogRepository extends JpaRepository<Dog, Long> {

    public List<Dog> findAllByOwnerId(long id);
}
