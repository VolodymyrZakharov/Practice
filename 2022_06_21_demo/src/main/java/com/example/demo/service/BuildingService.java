package com.example.demo.service;

import com.example.demo.dto.BuildingRequestDTO;
import com.example.demo.dto.BuildingResponceDTO;

import java.util.List;

public interface BuildingService {

    void createBuilding(BuildingRequestDTO request);

    List<BuildingResponceDTO> getAllBuildings();

    BuildingResponceDTO getBuildingById(Long id);
}
