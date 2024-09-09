package com.example.ABC_Restaurant_Web_Application.repository;

import com.example.ABC_Restaurant_Web_Application.model.TableReservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TableReservationRepository extends JpaRepository<TableReservation, Long> {
}
