package com.CK.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RentCarRequestDto {

    private String username; // sonradan token a dönecek
    private String carId;
}
