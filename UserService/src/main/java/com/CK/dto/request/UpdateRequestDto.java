package com.CK.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UpdateRequestDto {

    private String authId;
    private String username;
    private String email;
    private String phone;
    private String country;
    private String city;

}
