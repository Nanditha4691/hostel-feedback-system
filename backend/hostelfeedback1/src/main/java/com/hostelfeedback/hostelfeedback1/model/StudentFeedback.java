package com.hostelfeedback.hostelfeedback1.model;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "student_feedback")

public class StudentFeedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;
    private String usn;
    private String courseSemester;
    private String hostelBlock;
    private String roomNumber;
    private String contactNumber;
    private String email;

    private int roomCondition;
    private int cleanliness;
    private int washroomCondition;
    private String drinkingWater;
    private String laundry;
    private int internetSpeed;
    private String electricity;

    private int foodQuality;
    private int messCleanliness;
    private String foodVariety;
    private String messWater;
    private String messTiming;

    private int security;
    private int wardenBehavior;
    private int discipline;
    private String raggingIssues;

    private int complaintResponse;
    private int repairTiming;
    private int garbageCleaning;

    @Column(columnDefinition = "TEXT")
    private String specificIssues;

    @Column(columnDefinition = "TEXT")
    private String suggestions;

    private int overallRating;

    private String createdBy;
    private LocalDateTime createdAt;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getRoomCondition() {
        return roomCondition;
    }

    public void setRoomCondition(int roomCondition) {
        this.roomCondition = roomCondition;
    }

    public int getCleanliness() {
        return cleanliness;
    }

    public void setCleanliness(int cleanliness) {
        this.cleanliness = cleanliness;
    }

    public int getWashroomCondition() {
        return washroomCondition;
    }

    public void setWashroomCondition(int washroomCondition) {
        this.washroomCondition = washroomCondition;
    }

    public String getDrinkingWater() {
        return drinkingWater;
    }

    public void setDrinkingWater(String drinkingWater) {
        this.drinkingWater = drinkingWater;
    }

    public String getLaundry() {
        return laundry;
    }

    public void setLaundry(String laundry) {
        this.laundry = laundry;
    }

    public int getInternetSpeed() {
        return internetSpeed;
    }

    public void setInternetSpeed(int internetSpeed) {
        this.internetSpeed = internetSpeed;
    }

    public String getElectricity() {
        return electricity;
    }

    public void setElectricity(String electricity) {
        this.electricity = electricity;
    }

    public int getFoodQuality() {
        return foodQuality;
    }

    public void setFoodQuality(int foodQuality) {
        this.foodQuality = foodQuality;
    }

    public int getMessCleanliness() {
        return messCleanliness;
    }

    public void setMessCleanliness(int messCleanliness) {
        this.messCleanliness = messCleanliness;
    }

    public String getFoodVariety() {
        return foodVariety;
    }

    public void setFoodVariety(String foodVariety) {
        this.foodVariety = foodVariety;
    }

    public String getMessWater() {
        return messWater;
    }

    public void setMessWater(String messWater) {
        this.messWater = messWater;
    }

    public String getMessTiming() {
        return messTiming;
    }

    public void setMessTiming(String messTiming) {
        this.messTiming = messTiming;
    }

    public int getSecurity() {
        return security;
    }

    public void setSecurity(int security) {
        this.security = security;
    }

    public int getWardenBehavior() {
        return wardenBehavior;
    }

    public void setWardenBehavior(int wardenBehavior) {
        this.wardenBehavior = wardenBehavior;
    }

    public int getDiscipline() {
        return discipline;
    }

    public void setDiscipline(int discipline) {
        this.discipline = discipline;
    }

    public String getRaggingIssues() {
        return raggingIssues;
    }

    public void setRaggingIssues(String raggingIssues) {
        this.raggingIssues = raggingIssues;
    }

    public int getComplaintResponse() {
        return complaintResponse;
    }

    public void setComplaintResponse(int complaintResponse) {
        this.complaintResponse = complaintResponse;
    }

    public int getRepairTiming() {
        return repairTiming;
    }

    public void setRepairTiming(int repairTiming) {
        this.repairTiming = repairTiming;
    }

    public int getGarbageCleaning() {
        return garbageCleaning;
    }

    public void setGarbageCleaning(int garbageCleaning) {
        this.garbageCleaning = garbageCleaning;
    }

    public String getSpecificIssues() {
        return specificIssues;
    }

    public void setSpecificIssues(String specificIssues) {
        this.specificIssues = specificIssues;
    }

    public String getSuggestions() {
        return suggestions;
    }

    public void setSuggestions(String suggestions) {
        this.suggestions = suggestions;
    }

    public int getOverallRating() {
        return overallRating;
    }

    public void setOverallRating(int overallRating) {
        this.overallRating = overallRating;
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
