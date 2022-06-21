package com.example.dogs_and_owners.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@AllArgsConstructor
@Data
@Builder
public class DogResponseDTO {

    private long id;
    private String nickName;
    private String breed;
    private LocalDate dateOfBirth;
    private Long ownerId;
    private LocalDate registrationDate;
}
