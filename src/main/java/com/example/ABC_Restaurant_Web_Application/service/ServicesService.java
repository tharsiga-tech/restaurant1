package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Services;
import com.example.ABC_Restaurant_Web_Application.repository.ServicesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class ServicesService {
    @Autowired
    ServicesRepository servicesRepository;

    public Services addServices(Services services)
    {
        return servicesRepository.save(services);
    }

    public Services getServices(Long id)
    {
        return servicesRepository.findById(id).orElse(null);
    }

    public List<Services> getAllServices() {
        return servicesRepository.findAll();
    }

    public String deleteServices(Long id) {
        servicesRepository.deleteById(id);
        return "Service Deleted Successfully!";
    }

    public Services updateServices(Long id, Services services)
    {
        services.setId(id);
        return servicesRepository.save(services);
    }
}
