import java.util.Locale;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите сторону a: ");
        double a = readDouble(sc);

        System.out.print("Введите сторону b: ");
        double b = readDouble(sc);

        System.out.print("Введите сторону c: ");
        double c = readDouble(sc);

        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Треугольник не существует: стороны должны быть > 0.");
            return;
        }

        boolean exists = a + b > c && a + c > b && b + c > a;
        if (!exists) {
            System.out.println("Треугольник не существует (нарушено неравенство треугольника).");
            return;
        }

        if (a == b && b == c) {
            System.out.println("Треугольник существует. Вид: равносторонний.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Треугольник существует. Вид: равнобедренный.");
        } else {
            System.out.println("Треугольник существует. Вид: разносторонний.");
        }

        sc.close();
    }

    private static double readDouble(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim().replace(',', '.');
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Ошибка. Введите число ещё раз: ");
            }
        }
    }
}
