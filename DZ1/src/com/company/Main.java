package com.company;

import java.util.Scanner;

public class Main {
//задача 8.11
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество стульев:");
        int chair = scanner.nextInt();
        System.out.println("Введите количество учеников:");
        int pupil = scanner.nextInt();
        if (pupil > chair) {
            System.out.println("В классе недостаточно стульев, " + (pupil - chair) + " ученика без стула.");
        } else {
            System.out.println((chair-pupil) + " стула лишние.");
        }
    }
}
