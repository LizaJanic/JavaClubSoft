package com.company;

public class Exercise_22_10 {
    public static void main(String[] args){
        int n = 3;
        int m = 4;
        int[][] array = new int[n][m];
        array = buildArray(array);
        printArray(array);
        System.out.println("Сумма всех значений массива: " + countSum(array));
    }

    private static int[][] buildArray(int[][] array){
        int down = 1;
        int up = 40;
        for ( int i = 0; i < array.length; i++){
            for ( int j = 0; j < array[0].length; j++){
                array[i][j] = down + (int)((up - down + 1)*Math.random());
            }
        }
        return array;
    }

    private static void printArray(int[][] array){
        for ( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%4d", array[i][j]);
            }
            System.out.println();
        }
    }

    private static int countSum(int[][] array){
        int sum = 0;
        for ( int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                sum += array[i][j];
            }
        }
        return sum;
    }
}
