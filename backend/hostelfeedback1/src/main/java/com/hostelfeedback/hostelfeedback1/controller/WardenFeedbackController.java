package com.hostelfeedback.hostelfeedback1.controller;


import com.hostelfeedback.hostelfeedback1.model.WardenFeedback;
import com.hostelfeedback.hostelfeedback1.repository.WardenFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/saveWarden")
@CrossOrigin("http://localhost:3000")
public class WardenFeedbackController {

    @Autowired
    private WardenFeedbackRepository FeedbackRepository;

    // Get all feedback
    @GetMapping
    public List<WardenFeedback> getAllFeedback() {
        return FeedbackRepository.findAll();
    }

    // Submit feedback
    @PostMapping
    public WardenFeedback submitFeedback(@RequestBody WardenFeedback saveWarden) {
        saveWarden.setCreatedAt(LocalDateTime.now());
        return FeedbackRepository.save(saveWarden);
    }

}
