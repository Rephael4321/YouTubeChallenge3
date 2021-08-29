package com.youtubechallenge2.code;

public class Heart extends Organ {
    private int heartRate;

    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Heart Rate: " + this.heartRate);
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        System.out.println("Heart rate changed to: " + this.heartRate);
    }
}
