package com.CK.exception;

import lombok.Getter;



@Getter
public class VehicleManagerException extends RuntimeException{

    private final ErrorType errorType;

    public VehicleManagerException(ErrorType errorType, String customMessage){
        super(customMessage);
        this.errorType = errorType;
    }
    public VehicleManagerException(ErrorType errorType){
        super(errorType.getMessage());
        this.errorType = errorType;
    }
}