package com.hostelfeedback.hostelfeedback1.repository;


import com.hostelfeedback.hostelfeedback1.model.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findByStudentUsername(String studentUsername);
}
