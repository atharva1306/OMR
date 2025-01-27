package com.GTasterix.OMR.dto;

import lombok.*;

//@Data
@Getter
@Setter
@NoArgsConstructor
//@Builder
public class BaseResponseDto {
    private String message;
    private Object data;
    private Boolean hasError;


    public BaseResponseDto(String message, Object data, Boolean hasError) {
        this.message = message;
        this.data = data;
        this.hasError = hasError;
    }

    110

}

