package com.example.ABC_Restaurant_Web_Application.repository;

import com.example.ABC_Restaurant_Web_Application.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
