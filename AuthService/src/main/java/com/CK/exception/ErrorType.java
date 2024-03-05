package com.CK.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
public enum ErrorType {

    INTERNAL_SERVER_ERROR(5100, "Sunucu Hatasi",HttpStatus.INTERNAL_SERVER_ERROR),
    BAD_REQUEST (4100,"Parametre hatasi", HttpStatus.BAD_REQUEST),
    PASSWORDS_DO_NOT_MATCH(4110,"Sifreler uyusmuyor...",HttpStatus.BAD_REQUEST),
    USERNAME_DUPLICATE(4111,"Böyle bir kullanici adi sistemde mevcut...", HttpStatus.BAD_REQUEST),
    USER_NOT_FOUND(4112,"Böyle bir kullanici bulunamadi...",HttpStatus.BAD_REQUEST),
    PASSWORD_INCORRECT(4113,"Sifre hatali...",HttpStatus.BAD_REQUEST),
    USER_NOT_CREATED(4118,"Kullanici profili olusturulamadi...",HttpStatus.BAD_REQUEST);



    private int code;
    private String message;
    private HttpStatus httpStatus;
}
