package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Services;
import com.example.ABC_Restaurant_Web_Application.service.ServicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin(origins = "*")
public class ServicesController {
    @Autowired
    ServicesService servicesService;

    @PostMapping("/addServices")
    public Services addServices(@RequestBody Services services)
    {
        return servicesService.addServices(services);
    }

    @GetMapping("/getService/{id}")
    public Services getServices(@PathVariable Long id)
    {
        return servicesService.getServices(id);
    }

    @GetMapping("/getAllServices")
    public List<Services> getAllServices() {
        return servicesService.getAllServices();
    }

    @DeleteMapping("/deleteService/{id}")
    public String deleteServices(@PathVariable Long id) {
        return servicesService.deleteServices(id);
    }

    @PutMapping("/updateService/{id}")
    public Services updateServices(@PathVariable Long id, @RequestBody Services services) {
        return servicesService.updateServices(id, services);
    }
}
