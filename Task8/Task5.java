package org.college.practice_work_8;

import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть рядок: ");
        String str = sc.nextLine();

        String[] verybadwords = {
                "мандарини",
                "стипендію",
                "сесію",
        };

        String rep = "[Цензура]";
        String result = str;

        for(int i = 0; i < verybadwords.length; i++){
            result = result.replaceAll("(?i)" + verybadwords[i], rep);
        }

        System.out.println("Рядок після цензури: " + result);
    }
}
