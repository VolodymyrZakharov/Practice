package com.example.dogs_and_owners.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@Data
@Builder
public class OwnerResponseDTO {

    private long id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private List<DogResponseDTO> dogsList;
}
