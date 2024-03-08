package com.CK.dto.response;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class VehicleResponseDto {

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
}
