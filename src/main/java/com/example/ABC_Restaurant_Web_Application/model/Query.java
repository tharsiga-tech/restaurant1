package com.example.ABC_Restaurant_Web_Application.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "query")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Query {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fullnameh", nullable = false, length = 50)
    private String fullname;

    @Column(name = "contactnoh", nullable = false, length = 50)
    private String contactNo;

    @Column(name = "emailh", nullable = false, length = 50)
    private String email;

    @Column(name = "messageh", nullable = false, length = 50)
    private String message;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
