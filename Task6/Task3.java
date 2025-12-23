package org.college.practice_work_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть розмір масиву: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(100);
        }

        System.out.println("Згенерований масив: " + Arrays.toString(arr));

        System.out.print("Введіть значення, яке потрібно знайти: ");
        int valueToFind = sc.nextInt();

        System.out.print("Введіть значення для заміни: ");
        int valueToReplace = sc.nextInt();


        boolean found = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valueToFind){
                arr[i] = valueToReplace;
                found = true;
            }
        }

        if(found){
            System.out.println("Масив після заміни: " + Arrays.toString(arr));
        } else {
            System.out.println("Значення " + valueToFind + " не знайдено у масиві.");
        }
    }
}
