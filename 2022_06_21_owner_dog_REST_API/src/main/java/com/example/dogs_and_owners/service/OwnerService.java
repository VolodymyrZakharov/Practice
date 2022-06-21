package com.example.dogs_and_owners.service;

import com.example.dogs_and_owners.dto.OwnerRequestDTO;
import com.example.dogs_and_owners.dto.OwnerResponseDTO;

import java.util.List;

public interface OwnerService {

    void createOwner(OwnerRequestDTO request);

    OwnerResponseDTO getOwnerById(long id);

    List<OwnerResponseDTO> getAllOwners();

    void dogToggle(long id, long dog_id);
}
