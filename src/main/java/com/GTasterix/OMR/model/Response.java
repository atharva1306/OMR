package com.GTasterix.OMR.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

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
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] signature;
    @Lob
    @Column(columnDefinition = "LONGBLOB")
    private byte[] invigilatorSignature;
    @JdbcTypeCode(SqlTypes.JSON)
    @Column(columnDefinition = "JSON")
    private List<String> answers = new ArrayList<>();
}
