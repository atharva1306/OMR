package com.GTaster.x.OMR.model;

import jakarta.persistence.Entity;

@Entity
public class Student {
    private int rollNumber;
    private int standard;
    private String name;
    private String signature;
    private String invigilatorSignature;

}
