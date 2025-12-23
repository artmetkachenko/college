import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите N (целое число >= 1): ");
        int n = readInt(sc);

        if (n < 2) {
            System.out.println("Простых чисел в диапазоне 1.." + n + " нет.");
            return;
        }

        System.out.println("Простые числа в диапазоне 1.." + n + ":");
        for (int x = 2; x <= n; x++) {
            boolean prime = true;

            for (int d = 2; d * d <= x; d++) {
                if (x % d == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(x + " ");
            }
        }
        System.out.println();

        sc.close();
    }

    private static int readInt(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Ошибка. Введите целое число: ");
            }
        }
    }
}
