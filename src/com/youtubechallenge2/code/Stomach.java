package com.youtubechallenge2.code;

public class Stomach extends Organ {
    private String message;

    public Stomach(String name, String medicalCondition, String message) {
        super(name, medicalCondition);
        this.message = message;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(message);
    }

    public void startDigest() {
        System.out.println("Digesting begin...");
    }
}
