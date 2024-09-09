package com.example.ABC_Restaurant_Web_Application.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "offers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Offer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "offer_name", nullable = false, length = 50)
    private String offerName;

    @Column(name = "offer_image", nullable = false)
    private String offerImage;

    @Column(name = "offer_description", nullable = false, length = 100)
    private String offerDescription;

    @Column(name = "offer_info", nullable = false, length = 100)
    private String offerInfo;

    @Column(name = "offer_start_date", nullable = false)
    private LocalDate offerStartDate;

    @Column(name = "offer_end_date", nullable = false)
    private LocalDate offerEndDate;

    @Column(name = "offer_type", nullable = false, length = 50)
    private String offerType;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferImage() {
        return offerImage;
    }

    public void setOfferImage(String offerImage) {
        this.offerImage = offerImage;
    }

    public String getOfferDescription() {
        return offerDescription;
    }

    public void setOfferDescription(String offerDescription) {
        this.offerDescription = offerDescription;
    }

    public String getOfferInfo() {
        return offerInfo;
    }

    public void setOfferInfo(String offerInfo) {
        this.offerInfo = offerInfo;
    }

    public LocalDate getOfferStartDate() {
        return offerStartDate;
    }

    public void setOfferStartDate(LocalDate offerStartDate) {
        this.offerStartDate = offerStartDate;
    }

    public LocalDate getOfferEndDate() {
        return offerEndDate;
    }

    public void setOfferEndDate(LocalDate offerEndDate) {
        this.offerEndDate = offerEndDate;
    }

    public String getOfferType() {
        return offerType;
    }

    public void setOfferType(String offerType) {
        this.offerType = offerType;
    }
}

