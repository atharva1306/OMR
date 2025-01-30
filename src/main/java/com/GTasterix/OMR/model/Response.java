package com.GTasterix.OMR.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;



@Entity
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private Integer rollNumber;
    private Integer standard;
    private String Studentname;

    public String getExam() {
        return Exam;
    }

    public void setExam(String exam) {
        Exam = exam;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Integer getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(Integer rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public String getStudentname() {
        return Studentname;
    }

    public void setStudentname(String studentname) {
        Studentname = studentname;
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

    public List<String> getAnswers() {
        return answers;
    }

    public void setAnswers(List<String> answers) {
        this.answers = answers;
    }

    private String Exam;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] signature;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] invigilatorSignature;
//    @JdbcTypeCode(SqlTypes.JSON)
//    @Column(columnDefinition = "JSON")
    private List<String> answers = new ArrayList<>();
}
