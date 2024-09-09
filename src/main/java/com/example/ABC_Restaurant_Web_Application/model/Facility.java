package com.example.ABC_Restaurant_Web_Application.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "facility")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Facility {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "facility_name", nullable = false, length = 100)
    private String facilityName;

    @Column(name = "facility_image", nullable = false)
    private String facilityImage;

    @Column(name = "facility_description", nullable = false, length = 100)
    private String facilityDescription;

    @Column(name = "facility_info", nullable = false, length = 100)
    private String facilityInfo;

    @Column(name = "facility_type", nullable = false, length = 50)
    private String facilityType;

    @Column(name = "facility_capacity")
    private Integer facilityCapacity;

    @Column(name = "facility_availability", length = 100)
    private String facilityAvailability;

    @Column(name = "facility_restrictions", length = 100)
    private String facilityRestrictions;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFacilityName() {
        return facilityName;
    }

    public void setFacilityName(String facilityName) {
        this.facilityName = facilityName;
    }

    public String getFacilityImage() {
        return facilityImage;
    }

    public void setFacilityImage(String facilityImage) {
        this.facilityImage = facilityImage;
    }

    public String getFacilityDescription() {
        return facilityDescription;
    }

    public void setFacilityDescription(String facilityDescription) {
        this.facilityDescription = facilityDescription;
    }

    public String getFacilityInfo() {
        return facilityInfo;
    }

    public void setFacilityInfo(String facilityInfo) {
        this.facilityInfo = facilityInfo;
    }

    public String getFacilityType() {
        return facilityType;
    }

    public void setFacilityType(String facilityType) {
        this.facilityType = facilityType;
    }

    public Integer getFacilityCapacity() {
        return facilityCapacity;
    }

    public void setFacilityCapacity(Integer facilityCapacity) {
        this.facilityCapacity = facilityCapacity;
    }

    public String getFacilityAvailability() {
        return facilityAvailability;
    }

    public void setFacilityAvailability(String facilityAvailability) {
        this.facilityAvailability = facilityAvailability;
    }

    public String getFacilityRestrictions() {
        return facilityRestrictions;
    }

    public void setFacilityRestrictions(String facilityRestrictions) {
        this.facilityRestrictions = facilityRestrictions;
    }
}
