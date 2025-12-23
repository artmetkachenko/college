package org.college.practice_work_7;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        double[][] arr = new double[5][5];

        System.out.print("Бажаєте ввести данні вручнну? (y/n)");
        char ch = sc.next().charAt(0);

        if (ch == 'y') {
            System.out.println("Введіть 25 елементів матриці 5x5:");

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for(int i =0; i<arr.length; i++){
                for(int j =0; j<arr[i].length; j++){
                    System.out.printf("%6.2f", arr[i][j]);
                }
                System.out.println();
            }

        } else if  (ch == 'n') {

            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    arr[i][j] = rand.nextInt(19) - 9;
                }
            }

            for(int i =0; i<arr.length; i++){
                for(int j =0; j<arr[i].length; j++){
                    System.out.printf("%6.2f", arr[i][j]);
                }
                System.out.println();
            }

        } else {
            System.out.println("Такого вибіру не існує");
        }
        double det = 1;
        int swaps = 0; 

        for (int col = 0; col < 5; col++) {

            int pivot = col; 

            for (int r = col + 1; r < 5; r++) {
                if (Math.abs(arr[r][col]) > Math.abs(arr[pivot][col])) {
                    pivot = r;
                }
            }

            if (Math.abs(arr[pivot][col]) < 1e-12) {
                det = 0;
                break;
            }

            if (pivot != col) {
                double[] temp = arr[col];
                arr[col] = arr[pivot];
                arr[pivot] = temp;
                swaps++;
            }

            for (int r = col + 1; r < 5; r++) {
                double factor = arr[r][col] / arr[col][col];
                for (int c = col; c < 5; c++) {
                    arr[r][c] -= factor * arr[col][c];
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            det *= arr[i][i];
        }

        if (swaps % 2 == 1) det = -det;

        System.out.println("Визначник = " + det);


    }
}
