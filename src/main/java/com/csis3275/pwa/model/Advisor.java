package com.csis3275.pwa.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "advisors")

public class Advisor {
    @Id
    private String id;
    private String first_name;
    private String last_name;
    private String email;
    private String phoneNumber;
    private String avg_rating;
    private String category;

    public Advisor() {
    }

    public Advisor(String id, String first_name, String last_name, String email, String phoneNumber, String avg_rating, String category) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.avg_rating = avg_rating;
        this.category = category;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAvg_rating() {
        return avg_rating;
    }

    public void setAvg_rating(String avg_rating) {
        this.avg_rating = avg_rating;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Advisor [ID=" + getId() + ", First Name=" + getFirst_name() + ", Last Name=" + getLast_name() + ", Phone Number=" + getPhoneNumber() + ", Email=" + getEmail() + ", Avg Rating=" + getAvg_rating() + ", Category=" + getCategory() + "]";
    }
}