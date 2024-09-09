package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.DeliveryOrder;
import com.example.ABC_Restaurant_Web_Application.service.DeliveryOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class DeliveryOrderController {
    @Autowired
    DeliveryOrderService deliveryOrderService;

    @PostMapping("/addDeliveryOrder")
    public DeliveryOrder addDeliveryOrder(@RequestBody DeliveryOrder deliveryOrder)
    {
        return deliveryOrderService.addDeliveryOrder(deliveryOrder);
    } 

    @GetMapping("/getDeliveryOrder/{id}")
    public DeliveryOrder getDeliveryOrder(@PathVariable Long id)
    {
        return deliveryOrderService.getDeliveryOrder(id);
    }

    @GetMapping("/getAllDeliveryOrders")
    public List<DeliveryOrder> getAllDeliveryOrders() {
        return deliveryOrderService.getAllDeliveryOrders();
    }

    @DeleteMapping("/deleteDeliveryOrder/{id}")
    public String deleteDeliveryOrder(@PathVariable Long id) {
        return deliveryOrderService.deleteDeliveryOrder(id);
    }

    @PutMapping("/updateDeliveryOrder/{id}")
    public DeliveryOrder updateDeliveryOrder(@PathVariable Long id, @RequestBody DeliveryOrder deliveryOrder) {
        return deliveryOrderService.updateDeliveryOrder(id, deliveryOrder);
    }
}
