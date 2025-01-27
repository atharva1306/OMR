package com.GTasterix.OMR.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer rollNumber;
    private Integer standard;
    private String Studentname;
    private String Exam;
    private String signature;
    private String invigilatorSignature;
    private List<String> answers = new ArrayList<>(75);
}
