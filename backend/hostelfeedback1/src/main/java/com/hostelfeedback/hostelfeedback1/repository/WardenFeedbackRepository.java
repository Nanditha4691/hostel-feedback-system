package com.hostelfeedback.hostelfeedback1.repository;

import com.hostelfeedback.hostelfeedback1.model.WardenFeedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WardenFeedbackRepository extends JpaRepository<WardenFeedback,Long> {

}
