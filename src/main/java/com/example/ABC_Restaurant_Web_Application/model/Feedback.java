package com.example.ABC_Restaurant_Web_Application.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "feedback")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullname", nullable = false, length = 50)
    private String fullName;

    @Column(name = "contactno", nullable = false, length = 50)
    private String contactNo;

    @Column(name = "email", nullable = false, length = 50)
    private String email;

    @Column(name = "feedback", nullable = false, length = 50)
    private String feedback;

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

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
}
