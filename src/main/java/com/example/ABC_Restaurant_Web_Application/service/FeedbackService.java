package com.example.ABC_Restaurant_Web_Application.service;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.model.Services;
import com.example.ABC_Restaurant_Web_Application.repository.FeedbackRepository;
import com.example.ABC_Restaurant_Web_Application.repository.ServicesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Data
@Service
public class FeedbackService {
    @Autowired
    FeedbackRepository feedbackRepository;

    public Feedback addFeedback(Feedback feedback)
    {
        return feedbackRepository.save(feedback);
    }

    public Feedback getFeedback(Long id)
    {
        return feedbackRepository.findById(id).orElse(null);
    }

    public List<Feedback> getAllFeedbacks() {
        return feedbackRepository.findAll();
    }

    public String deleteFeedback(Long id) {
        feedbackRepository.deleteById(id);
        return "Feedback Deleted Successfully!";
    }

    public Feedback updateFeedback(Long id, Feedback feedback)
    {
        feedback.setId(id);
        return feedbackRepository.save(feedback);
    }
}
