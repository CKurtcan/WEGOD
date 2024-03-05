package com.CK.dto.request;

import com.CK.utility.enums.Nationality;
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
public class RegisterRequestDto {

    private Nationality nationality;
    private String idNum;
    private String email;
    private String username;
    private String password;
    private String passwordConfirm;
}
