package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Facility;
import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.repository.FacilityRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class FacilityService {
    @Autowired
    FacilityRepository facilityRepository;

    public Facility addFacility(Facility facility)
    {
        return facilityRepository.save(facility);
    }

    public Facility getFacility(Long id)
    {
        return facilityRepository.findById(id).orElse(null);
    }

    public List<Facility> getAllFacilities() {
        return facilityRepository.findAll();
    }

    public String deleteFacility(Long id) {
        facilityRepository.deleteById(id);
        return "Facility Deleted Successfully!";
    }

    public Facility updateFacility(Long id, Facility facility)
    {
        facility.setId(id);
        return facilityRepository.save(facility);
    }
}
