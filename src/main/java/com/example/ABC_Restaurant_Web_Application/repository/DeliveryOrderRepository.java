package com.example.ABC_Restaurant_Web_Application.repository;

import com.example.ABC_Restaurant_Web_Application.model.DeliveryOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryOrderRepository extends JpaRepository<DeliveryOrder, Long> {
}
