import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст (одно или несколько предложений):");
        String text = sc.nextLine();

        int count = 0;
        int i = 0;

        while (i < text.length()) {
            char ch = text.charAt(i);
            if (ch == '.' || ch == '!' || ch == '?') {
                count++;

                int j = i + 1;
                while (j < text.length()) {
                    char next = text.charAt(j);
                    if (next == '.' || next == '!' || next == '?') {
                        j++;
                    } else {
                        break;
                    }
                }
                i = j;
                continue;
            }
            i++;
        }

        System.out.println("Количество предложений: " + count);

        sc.close();
    }
}

