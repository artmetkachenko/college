
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        System.out.println("=== Primitive Data Types Information ===");

        printTypeInfo("byte", Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        printTypeInfo("short", Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        printTypeInfo("int", Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        printTypeInfo("long", Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        printTypeInfo("float", Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        printTypeInfo("double", Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
        printTypeInfo("char", Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        printTypeInfo("boolean", 1, "false", "true");

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== Data Input Section ===");

        System.out.print("Enter integer (int): ");
        int intValue = Integer.parseInt(scanner.nextLine());
        System.out.println("You entered int: " + intValue);

        System.out.print("Enter double: ");
        double doubleValue = Double.parseDouble(scanner.nextLine());
        System.out.println("You entered double: " + doubleValue);

        System.out.print("Enter boolean (true/false): ");
        boolean booleanValue = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("You entered boolean: " + booleanValue);

        System.out.print("Enter character (char): ");
        char charValue = scanner.nextLine().charAt(0);
        System.out.println("You entered char: " + charValue);

        scanner.close();
    }

    private static void printTypeInfo(String name, int size, Object min, Object max) {
        System.out.println(
                "Type: " + name +
                ", Size: " + size + " bits" +
                ", Min: " + min +
                ", Max: " + max
        );
    }
}
