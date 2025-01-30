package com.GTasterix.OMR.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
    private int rollNumber;
    private int standard;

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    public byte[] getSignature() {
        return signature;
    }

    public void setSignature(byte[] signature) {
        this.signature = signature;
    }

    public byte[] getInvigilatorSignature() {
        return invigilatorSignature;
    }

    public void setInvigilatorSignature(byte[] invigilatorSignature) {
        this.invigilatorSignature = invigilatorSignature;
    }

    private String studentname;
    private String exam;
    private List<String> answers;
    private byte[] signature;
    private byte[] invigilatorSignature;

    // Getters and Setters
}