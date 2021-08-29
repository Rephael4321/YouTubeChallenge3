package com.youtubechallenge2.code;

public class RightEye extends Organ{
    private String color;
    private boolean open;

    public RightEye(String name, String medicalCondition, String color, boolean open) {
        super(name, medicalCondition);
        this.color = color;
        this.open = open;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println(this.color);
    }

    public void closeEye() {
        this.open = false;
        System.out.println("Right Eye Closed");
    }

    public void openEye() {
        this.open = true;
        System.out.println("Right Eye Opened");
    }

    public boolean isOpen() {
        return open;
    }
}
