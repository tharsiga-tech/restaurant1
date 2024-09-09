package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Payment;
import com.example.ABC_Restaurant_Web_Application.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class PaymentController {
    @Autowired
    PaymentService paymentService;

    @PostMapping("/addPayment")
    public Payment addPayment(@RequestBody Payment payment)
    {
        return paymentService.addPayment(payment);
    }

    @GetMapping("/getPayment/{id}")
    public Payment getPayment(@PathVariable Long id)
    {
        return paymentService.getPayment(id);
    }

    @GetMapping("/getAllPayments")
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    @DeleteMapping("/deletePayment/{id}")
    public String deletePayment(@PathVariable Long id) {
        return paymentService.deletePayment(id);
    }

    @PutMapping("/updatePayment/{id}")
    public Payment updatePayment(@PathVariable Long id, @RequestBody Payment payment) {
        return paymentService.updatePayment(id, payment);
    }
}
