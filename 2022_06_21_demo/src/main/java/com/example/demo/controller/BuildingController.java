package com.example.demo.controller;

import com.example.demo.dto.BuildingRequestDTO;
import com.example.demo.dto.BuildingResponceDTO;
import com.example.demo.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuildingController {

    @Autowired
    private BuildingService buildingService;

    @GetMapping("/buildings")
    public List<BuildingResponceDTO> getAllBuildings() {
        return buildingService.getAllBuildings();
    }

    @GetMapping("/buildings/id")
    public BuildingResponceDTO getBuildingById(@PathVariable("id") long id) {
        return buildingService.getBuildingById(id);
    }

    @PostMapping("/buildings")
    public void createBuilding(@RequestBody BuildingRequestDTO request) {
        buildingService.createBuilding(request);
    }
}
