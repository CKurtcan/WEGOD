package com.CK.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_SERVER_ERROR(5100, "Sunucu Hatasi",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST (4100,"Parametre hatasi", HttpStatus.BAD_REQUEST),
    VEHICLE_NOT_FOUND(4111,"Araç bulunamadı...",HttpStatus.BAD_REQUEST),
    NO_AVAILABLE_VEHICLES_FOUND(4112,"Yakınlarda araç bulunamadı...",HttpStatus.BAD_REQUEST);



    private int code;
    private String message;
    private HttpStatus httpStatus;
}
