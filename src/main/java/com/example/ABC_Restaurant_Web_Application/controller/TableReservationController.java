package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.TableReservation;
import com.example.ABC_Restaurant_Web_Application.service.TableReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class TableReservationController {
    @Autowired
    TableReservationService tableReservationService;

    @PostMapping("/addTableReservation")
    public TableReservation addTableReservation(@RequestBody TableReservation tableReservation)
    {
        return tableReservationService.addTableReservation(tableReservation);
    }

    @GetMapping("/getTableReservation/{id}")
    public TableReservation getTableReservation(@PathVariable Long id)
    {
        return tableReservationService.getTableReservation(id);
    }

    @GetMapping("/getAllTableReservations")
    public List<TableReservation> getAllTableReservations() {
        return tableReservationService.getAllTableReservations();
    }

    @DeleteMapping("/deleteTableReservation/{id}")
    public String deleteTableReservation(@PathVariable Long id) {
        return tableReservationService.deleteTableReservation(id);
    }

    @PutMapping("/updateTableReservation/{id}")
    public TableReservation updateTableReservation(@PathVariable Long id, @RequestBody TableReservation tableReservation) {
        return tableReservationService.updateTableReservation(id, tableReservation);
    }
}
