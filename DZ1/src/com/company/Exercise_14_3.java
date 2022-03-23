package com.company;

import java.lang.reflect.Array;
import java.util.Random;

public class Exercise_14_3 {
    public static void main(String[] args) {
        int[] Array = new int[50];
        Random random = new Random();
        int i;
        for (i = 0; i < Array.length; i++) {
            Array[i] = (-40) + random.nextInt(40 - (-40) +1);
            System.out.println(Array[i]);
        }
        int min = Array[0];
        for (i = 0; i < Array.length; i++) {
            if (min > Array[i]) {
                min = Array[i];
            }
        }
        int max = Array[0];
        for (i = 0; i < Array.length; i++) {
            if (max < Array[i]) {
                max = Array[i];
            }
        }
        System.out.println("В сгенерированной серии чисел максимальное значение " + max
                + " и минимальное значение " + min);

    }
}
