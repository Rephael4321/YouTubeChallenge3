package com.youtubechallenge2.code;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LeftEye leftEye = new LeftEye("Left Eye", "Short sighted", "Blue", true);
        RightEye rightEye = new RightEye("Right Eye", "Normal", "Blue", true);
        Heart heart = new Heart("Heart", "Normal", 65);
        Stomach stomach = new Stomach("Stomach", "PUD", "Need to be fed");
        Skin skin = new Skin("Skin", "Burned");

        Human human = new Human("Tom", 25, leftEye, rightEye, heart, stomach, skin);

        int answer;

        do {
            System.out.println("Name:  " + human.getName());
            System.out.println("Age: " + human.getAge());
            System.out.println("Choose an Organ:");
            System.out.println("\t\t1. " + leftEye.getName());
            System.out.println("\t\t2. " + rightEye.getName());
            System.out.println("\t\t3. " + heart.getName());
            System.out.println("\t\t4. " + stomach.getName());
            System.out.println("\t\t5. " + skin.getName());
            System.out.println("\t\t6. Quit");

            Scanner scanner = new Scanner(System.in);
            answer = scanner.nextInt();

            switch (answer) {
                case 1 -> {
                    leftEye.printData();
                    if (leftEye.isOpen()) {
                        System.out.println("\t\t1. Close the Eye");
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                    }

                    answer = scanner.nextInt();

                    if (answer == 1) {
                        if (leftEye.isOpen()) {
                            leftEye.closeEye();
                        } else {
                            leftEye.openEye();
                        }
                    } else {
                        // ensures that the program does not exit by selecting 6
                        answer = 0;
                    }
                }
                case 2 -> {
                    rightEye.printData();
                    if (rightEye.isOpen()) {
                        System.out.println("\t\t1. Close the Eye");
                    } else {
                        System.out.println("\t\t1. Open the Eye");
                    }

                    answer = scanner.nextInt();

                    if (answer == 1) {
                        if (rightEye.isOpen()) {
                            rightEye.closeEye();
                        } else {
                            rightEye.openEye();
                        }
                    } else {
                        // ensures that the program does not exit by selecting 6
                        answer = 0;
                    }
                }
                case 3 -> {
                    heart.printData();
                    System.out.println("\t\t1. Change the heart rate");

                    answer = scanner.nextInt();

                    if (answer == 1) {
                        System.out.println("Enter the new heart rate:");
                        answer = scanner.nextInt();
                        heart.setHeartRate(answer);
                    }
                    // ensures that the program does not exit by selecting 6
                    answer = 0;
                }
                case 4 -> {
                    stomach.printData();
                    System.out.println("\t\t1. Digest");

                    answer = scanner.nextInt();

                    if (answer == 1) {
                        stomach.startDigest();
                    } else {
                        answer = 0;
                    }
                }
                case 5 -> skin.printData();
                default -> {
                }
            }
        } while (answer != 6);
    }
}
