package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Customer;
import com.example.ABC_Restaurant_Web_Application.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
//@CrossOrigin(origins = "http://localhost:8080")
@CrossOrigin(origins = "*")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer customer)
    {
        return customerService.addCustomer(customer);
    }

    @GetMapping("/getCustomer/{id}")
    public Customer getCustomer(@PathVariable Long id)
    {
        return customerService.getCustomer(id);
    }

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public String deleteCustomer(@PathVariable Long id) {
        return customerService.deleteCustomer(id);
    }

    @PutMapping("/updateCustomer/{id}")
    public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
        return customerService.updateCustomer(id, customer);
    }
}
