package com.CK.entity;

import com.CK.utility.enums.EVehicleStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Vehicle")
public class Vehicle extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String brand;
    private String model;
    private String fuelType;
    private String transmissionType;
    private String age;
    private String km;
    private String deposit;
    private String price;
    private String location;
    private String about;
    private String image;

    @Builder.Default
    private EVehicleStatus status = EVehicleStatus.AVAILABLE;
}
