package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.model.TableReservation;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import com.example.ABC_Restaurant_Web_Application.repository.TableReservationRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class TableReservationService {
    @Autowired
    TableReservationRepository tableReservationRepository;

    public TableReservation addTableReservation(TableReservation tableReservation)
    {
        return tableReservationRepository.save(tableReservation);
    }

    public TableReservation getTableReservation(Long id)
    {
        return tableReservationRepository.findById(id).orElse(null);
    }

    public List<TableReservation> getAllTableReservations() {
        return tableReservationRepository.findAll();
    }

    public String deleteTableReservation(Long id) {
        tableReservationRepository.deleteById(id);
        return "TableReservation Deleted Successfully!";
    }

    public TableReservation updateTableReservation(Long id, TableReservation tableReservation)
    {
        tableReservation.setId(id);
        return tableReservationRepository.save(tableReservation);
    }
}
