package com.hostelfeedback.hostelfeedback1.repository;


import com.hostelfeedback.hostelfeedback1.model.StudentFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentFeedbackRepository extends JpaRepository<StudentFeedback, Long> {
}
