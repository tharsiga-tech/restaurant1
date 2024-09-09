package com.example.ABC_Restaurant_Web_Application.controller;


import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import com.example.ABC_Restaurant_Web_Application.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FeedbackController
 {
    @Autowired
    FeedbackService feedbackService;

    @PostMapping("/addFeedback")
    public Feedback addFeedback(@RequestBody Feedback feedback)
    {
        return feedbackService.addFeedback(feedback);
    }

    @GetMapping("/getFeedback/{id}")
    public Feedback getFeedback(@PathVariable Long id)
    {
        return feedbackService.getFeedback(id);
    }

    @GetMapping("/getAllFeedbacks")
    public List<Feedback> getAllFeedbacks() {
        return feedbackService.getAllFeedbacks();
    }

    @DeleteMapping("/deleteFeedback/{id}")
    public String deleteFeedback(@PathVariable Long id) {
        return feedbackService.deleteFeedback(id);
    }

    @PutMapping("/updateFeedback/{id}")
    public Feedback updateFeedback(@PathVariable Long id, @RequestBody Feedback feedback) {
        return feedbackService.updateFeedback(id, feedback);
    }
}

