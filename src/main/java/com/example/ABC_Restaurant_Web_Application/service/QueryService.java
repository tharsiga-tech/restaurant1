package com.example.ABC_Restaurant_Web_Application.service;


import com.example.ABC_Restaurant_Web_Application.model.Query;
import com.example.ABC_Restaurant_Web_Application.repository.QueryRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class QueryService {
    @Autowired
    QueryRepository queryRepository;

    public Query addQuery(Query query)
    {
        return queryRepository.save(query);
    }

    public Query getQuery(Long id)
    {
        return queryRepository.findById(id).orElse(null);
    }

    public List<Query> getAllQueries() {
        return queryRepository.findAll();
    }

    public String deleteQuery(Long id) {
        queryRepository.deleteById(id);
        return "Query Deleted Successfully!";
    }

    public Query updateQuery(Long id, Query query)
    {
        query.setId(id);
        return queryRepository.save(query);
    }
}
