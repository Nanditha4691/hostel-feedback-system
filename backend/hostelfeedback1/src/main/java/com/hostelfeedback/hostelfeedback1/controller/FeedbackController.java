package com.hostelfeedback.hostelfeedback1.controller;


import com.hostelfeedback.hostelfeedback1.model.StudentFeedback;
import com.hostelfeedback.hostelfeedback1.model.WardenFeedback;
import com.hostelfeedback.hostelfeedback1.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/feedback")
@CrossOrigin(origins = "http://localhost:3000") // Allow frontend requests
public class FeedbackController {

    @Autowired
    private FeedbackService feedbackService;

    // Get all student feedback
    @GetMapping("/students")
    public List<StudentFeedback> getStudentFeedback() {
        return feedbackService.getAllStudentFeedback();
    }

    // Get all warden feedback
    @GetMapping("/wardens")
    public List<WardenFeedback> getWardenFeedback() {
        return feedbackService.getAllWardenFeedback();
    }
}
