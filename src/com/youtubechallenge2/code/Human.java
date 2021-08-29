package com.youtubechallenge2.code;

public class Human {
    private String name;
    private int age;
    private LeftEye leftEye;
    private RightEye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Human(String name, int age, LeftEye leftEye, RightEye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
