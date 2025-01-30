package com.GTasterix.OMR.dto;

import lombok.*;


@NoArgsConstructor
//@Builder
public class BaseResponseDto {
    private String message;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getHasError() {
        return hasError;
    }

    public void setHasError(Boolean hasError) {
        this.hasError = hasError;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private Boolean hasError;


    public BaseResponseDto(String message, Object data, Boolean hasError) {
        this.message = message;
        this.data = data;
        this.hasError = hasError;
    }



}

