package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.DeliveryOrder;
import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.repository.DeliveryOrderRepository;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class DeliveryOrderService {
    @Autowired
    DeliveryOrderRepository deliveryOrderRepository;

    public DeliveryOrder addDeliveryOrder(DeliveryOrder deliveryOrder)
    {
        return deliveryOrderRepository.save(deliveryOrder);
    }

    public DeliveryOrder getDeliveryOrder(Long id)
    {
        return deliveryOrderRepository.findById(id).orElse(null);
    }

    public List<DeliveryOrder> getAllDeliveryOrders() {
        return deliveryOrderRepository.findAll();
    }

    public String deleteDeliveryOrder(Long id) {
        deliveryOrderRepository.deleteById(id);
        return "DeliveryOrder Deleted Successfully!";
    }

    public DeliveryOrder updateDeliveryOrder(Long id, DeliveryOrder deliveryOrder)
    {
        deliveryOrder.setId(id);
        return deliveryOrderRepository.save(deliveryOrder);
    }
}
