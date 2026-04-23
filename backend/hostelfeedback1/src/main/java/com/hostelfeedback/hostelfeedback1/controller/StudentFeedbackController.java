package com.hostelfeedback.hostelfeedback1.controller;

import com.hostelfeedback.hostelfeedback1.model.StudentFeedback;
import com.hostelfeedback.hostelfeedback1.repository.StudentFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/saveStudent")
@CrossOrigin("http://localhost:3000") // React frontend URL
public class StudentFeedbackController {

    @Autowired
    private StudentFeedbackRepository feedbackRepository;

    // Get all feedback
    @GetMapping
    public List<StudentFeedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    // Submit feedback
    @PostMapping
    public StudentFeedback submitFeedback(@RequestBody StudentFeedback saveStudent) {
       saveStudent.setCreatedAt(LocalDateTime.now());
        return feedbackRepository.save(saveStudent);
    }
}
