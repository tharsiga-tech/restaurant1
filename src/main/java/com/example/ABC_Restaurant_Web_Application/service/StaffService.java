package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Staff;
import com.example.ABC_Restaurant_Web_Application.repository.StaffRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;

    public Staff addStaff(Staff staff)
    {
        return staffRepository.save(staff);
    }

    public Staff getStaff(Long id)
    {
        return staffRepository.findById(id).orElse(null);
    }

    public List<Staff> getAllStaffs() {
        return staffRepository.findAll();
    }

    public String deleteStaff(Long id) {
        staffRepository.deleteById(id);
        return "Staff Deleted Successfully!";
    }

    public Staff updateStaff(Long id, Staff staff)
    {
        staff.setId(id);
        return staffRepository.save(staff);
    }
}
