package com.hostelfeedback.hostelfeedback1.service;

import com.hostelfeedback.hostelfeedback1.model.StudentFeedback;
import com.hostelfeedback.hostelfeedback1.model.WardenFeedback;
import com.hostelfeedback.hostelfeedback1.repository.StudentFeedbackRepository;
import com.hostelfeedback.hostelfeedback1.repository.WardenFeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private StudentFeedbackRepository studentRepo;

    @Autowired
    private WardenFeedbackRepository wardenRepo;

    // Fetch all student feedback
    public List<StudentFeedback> getAllStudentFeedback() {
        return studentRepo.findAll();
    }

    // Fetch all warden feedback
    public List<WardenFeedback> getAllWardenFeedback() {
        return wardenRepo.findAll();
    }
}
