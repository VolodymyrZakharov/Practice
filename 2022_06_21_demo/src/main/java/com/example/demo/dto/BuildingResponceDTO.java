package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Data
@Builder
public class BuildingResponceDTO {

    private Long id;
    private String street;
    private String houseNumber;
    private Integer floorsCount;

}
