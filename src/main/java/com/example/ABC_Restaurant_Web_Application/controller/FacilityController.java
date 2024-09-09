package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Facility;
import com.example.ABC_Restaurant_Web_Application.service.FacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FacilityController {
    @Autowired
    FacilityService facilityService;

    @PostMapping("/addFacility")
    public Facility addFacility(@RequestBody Facility facility)
    {
        return facilityService.addFacility(facility);
    }

    @GetMapping("/getFacility/{id}")
    public Facility getFacility(@PathVariable Long id)
    {
        return facilityService.getFacility(id);
    }

    @GetMapping("/getAllFacilities")
    public List<Facility> getAllFacilities() {
        return facilityService.getAllFacilities();
    }

    @DeleteMapping("/deleteFacility/{id}")
    public String deleteFacility(@PathVariable Long id) {
        return facilityService.deleteFacility(id);
    }

    @PutMapping("/updateFacility/{id}")
    public Facility updateFacility(@PathVariable Long id, @RequestBody Facility facility) {
        return facilityService.updateFacility(id, facility);
    }
}
