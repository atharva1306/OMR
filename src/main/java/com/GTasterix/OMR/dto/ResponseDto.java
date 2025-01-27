package com.GTasterix.OMR.dto;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class ResponseDto {
    private Integer rollNumber;
    private Integer standard;
    private String Studentname;
    private String Exam;
    private String signature;
    private String invigilatorSignature;
    private List<String> answers = new ArrayList<>();
}
