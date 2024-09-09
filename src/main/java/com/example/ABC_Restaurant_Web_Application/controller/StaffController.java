package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Staff;
import com.example.ABC_Restaurant_Web_Application.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class StaffController {
    @Autowired
    StaffService staffService;

    @PostMapping("/addStaff")
    public Staff addStaff(@RequestBody Staff staff)
    {
        return staffService.addStaff(staff);
    }

    @GetMapping("/getStaff/{id}")
    public Staff getStaff(@PathVariable Long id)
    {
        return staffService.getStaff(id);
    }

    @GetMapping("/getAllStaffs")
    public List<Staff> getAllStaffs() {
        return staffService.getAllStaffs();
    }

    @DeleteMapping("/deleteStaff/{id}")
    public String deleteStaff(@PathVariable Long id) {
        return staffService.deleteStaff(id);
    }

    @PutMapping("/updateStaff/{id}")
    public Staff updateStaff(@PathVariable Long id, @RequestBody Staff staff) {
        return staffService.updateStaff(id, staff);
    }
}
