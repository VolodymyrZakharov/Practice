package com.example.demo.service.impl;

import com.example.demo.dto.BuildingRequestDTO;
import com.example.demo.dto.BuildingResponceDTO;
import com.example.demo.entity.Building;
import com.example.demo.repository.BuildingRepository;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BuildingServiceImpl implements BuildingService {

    @Autowired
    private BuildingRepository buildingRepository;

    @Override
    public void createBuilding(BuildingRequestDTO request) {
        Building building = Building.builder()
                .street(request.getStreet())
                .houseNumber(request.getHouseNumber())
                .floorsCount(request.getFloorsCount())
                .build();

        buildingRepository.save(building);
    }

    @Override
    public List<BuildingResponceDTO> getAllBuildings() {
        List<Building> dbBuildings = buildingRepository.findAll();
        return dbBuildings.stream()
                .map(building -> BuildingResponceDTO.builder()
                        .id(building.getId())
                        .houseNumber(building.getHouseNumber())
                        .street(building.getStreet())
                        .build())
                .collect(Collectors.toList());
    }

    @Override
    public BuildingResponceDTO getBuildingById(Long id) {
        Building building = buildingRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

        return BuildingResponceDTO.builder()
                .id(building.getId())
                .street(building.getStreet())
                .houseNumber(building.getHouseNumber())
                .floorsCount(building.getFloorsCount())
                .build();
    }
}


