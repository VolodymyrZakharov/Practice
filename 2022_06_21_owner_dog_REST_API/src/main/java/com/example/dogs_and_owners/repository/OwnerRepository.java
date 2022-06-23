package com.example.dogs_and_owners.repository;

import com.example.dogs_and_owners.entity.Dog;
import com.example.dogs_and_owners.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
