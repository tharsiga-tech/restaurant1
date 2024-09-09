package com.example.ABC_Restaurant_Web_Application.controller;

import com.example.ABC_Restaurant_Web_Application.model.Query;
import com.example.ABC_Restaurant_Web_Application.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class QueryController {
    @Autowired
    QueryService queryService;

    @PostMapping("/addQuery")
    public Query addQuery(@RequestBody Query query)
    {
        return queryService.addQuery(query);
    }

    @GetMapping("/getQuery/{id}")
    public Query getQuery(@PathVariable Long id)
    {
        return queryService.getQuery(id);
    }

    @GetMapping("/getAllQueries")
    public List<Query> getAllQueries() {
        return queryService.getAllQueries();
    }

    @DeleteMapping("/deleteQuery/{id}")
    public String deleteQuery(@PathVariable Long id) {
        return queryService.deleteQuery(id);
    }

    @PutMapping("/updateQuery/{id}")
    public Query updateQuery(@PathVariable Long id, @RequestBody Query query) {
        return queryService.updateQuery(id, query);
    }
}
