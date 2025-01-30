package com.GTasterix.OMR.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private Integer rollNumber;
    private Integer standard;

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public void setInvigilatorSignature(byte[] invigilatorSignature) {
        this.invigilatorSignature = invigilatorSignature;
    }

    private String Studentname;
    private String Exam;
    private byte[] signature;
    private byte[] invigilatorSignature;
    @JsonProperty("answers")

    private List<String> answers = new ArrayList<>();
}
