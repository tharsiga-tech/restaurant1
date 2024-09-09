package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Payment;
import com.example.ABC_Restaurant_Web_Application.repository.PaymentRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;

    public Payment addPayment(Payment payment)
    {
        return paymentRepository.save(payment);
    }

    public Payment getPayment(Long id)
    {
        return paymentRepository.findById(id).orElse(null);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public String deletePayment(Long id) {
        paymentRepository.deleteById(id);
        return "Payment Deleted Successfully!";
    }

    public Payment updatePayment(Long id, Payment payment)
    {
        payment.setId(id);
        return paymentRepository.save(payment);
    }
}
