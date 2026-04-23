package com.hostelfeedback.hostelfeedback1.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "warden_feedback")

public class WardenFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String studentName;
    private String usn;
    private String courseSemester;
    private String hostelBlock;
    private String roomNumber;
    private String dateOfAdmission;
    private String dateOfExit;
    private String reasonForLeaving;

    private String roomCondition;
    private String furnitureCondition;
    private String keysReturned;
    private String damagesReported;

    @Column(columnDefinition = "TEXT")
    private String damageDetails;

    private String messDuesCleared;
    private String roomRentDuesCleared;
    private String pendingFine;

    @Column(columnDefinition = "TEXT")
    private String fineDetails;

    private String studentBehavior;
    private String complaintsAgainstStudent;

    @Column(columnDefinition = "TEXT")
    private String overallFeedback;

    private String finalClearance;
    private String approved;
    private String wardenName;

    private String createdBy;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getCourseSemester() {
        return courseSemester;
    }

    public void setCourseSemester(String courseSemester) {
        this.courseSemester = courseSemester;
    }

    public String getHostelBlock() {
        return hostelBlock;
    }

    public void setHostelBlock(String hostelBlock) {
        this.hostelBlock = hostelBlock;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(String dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public void setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
    }

    public String getReasonForLeaving() {
        return reasonForLeaving;
    }

    public void setReasonForLeaving(String reasonForLeaving) {
        this.reasonForLeaving = reasonForLeaving;
    }

    public String getRoomCondition() {
        return roomCondition;
    }

    public void setRoomCondition(String roomCondition) {
        this.roomCondition = roomCondition;
    }

    public String getFurnitureCondition() {
        return furnitureCondition;
    }

    public void setFurnitureCondition(String furnitureCondition) {
        this.furnitureCondition = furnitureCondition;
    }


    public String getKeysReturned() {
        return keysReturned;
    }

    public void setKeysReturned(String keysReturned) {
        this.keysReturned = keysReturned;
    }

    public String getDamagesReported() {
        return damagesReported;
    }

    public void setDamagesReported(String damagesReported) {
        this.damagesReported = damagesReported;
    }

    public String getDamageDetails() {
        return damageDetails;
    }

    public void setDamageDetails(String damageDetails) {
        this.damageDetails = damageDetails;
    }

    public String getMessDuesCleared() {
        return messDuesCleared;
    }

    public void setMessDuesCleared(String messDuesCleared) {
        this.messDuesCleared = messDuesCleared;
    }

    public String getRoomRentDuesCleared() {
        return roomRentDuesCleared;
    }

    public void setRoomRentDuesCleared(String roomRentDuesCleared) {
        this.roomRentDuesCleared = roomRentDuesCleared;
    }

    public String getPendingFine() {
        return pendingFine;
    }

    public void setPendingFine(String pendingFine) {
        this.pendingFine = pendingFine;
    }

    public String getFineDetails() {
        return fineDetails;
    }

    public void setFineDetails(String fineDetails) {
        this.fineDetails = fineDetails;
    }

    public String getStudentBehavior() {
        return studentBehavior;
    }

    public void setStudentBehavior(String studentBehavior) {
        this.studentBehavior = studentBehavior;
    }

    public String getComplaintsAgainstStudent() {
        return complaintsAgainstStudent;
    }

    public void setComplaintsAgainstStudent(String complaintsAgainstStudent) {
        this.complaintsAgainstStudent = complaintsAgainstStudent;
    }

    public String getOverallFeedback() {
        return overallFeedback;
    }

    public void setOverallFeedback(String overallFeedback) {
        this.overallFeedback = overallFeedback;
    }

    public String getFinalClearance() {
        return finalClearance;
    }

    public void setFinalClearance(String finalClearance) {
        this.finalClearance = finalClearance;
    }

    public String getWardenName() {
        return wardenName;
    }

    public void setWardenName(String wardenName) {
        this.wardenName = wardenName;
    }

    public String getApproved() {
        return approved;
    }

    public void setApproved(String approved) {
        this.approved = approved;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}