package com.hostelfeedback.hostelfeedback1.model;

import jakarta.persistence.*;

@Entity
@Table(name = "feedbacks")
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String studentUsername; // Stores which student gave feedback

    @Column(nullable = false, length = 500)
    private String feedbackText;

    public Feedback() {}

    public Feedback(String studentUsername, String feedbackText) {
        this.studentUsername = studentUsername;
        this.feedbackText = feedbackText;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getStudentUsername() { return studentUsername; }
    public void setStudentUsername(String studentUsername) { this.studentUsername = studentUsername; }

    public String getFeedbackText() { return feedbackText; }
    public void setFeedbackText(String feedbackText) { this.feedbackText = feedbackText; }
}
