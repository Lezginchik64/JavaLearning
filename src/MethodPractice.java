import java.util.Scanner;

public class MethodPractice {
    public static void main(String[] args) {
        double num1 = getNumber();
        double num2 = getNumber();
        char operation = getOperation();
        double result = calc(num1, num2, operation);
        System.out.println("Result " + result);
    }

    private static char getOperation() {
        Scanner in = new Scanner(System.in); //1 +, 2 -, 3 *
        return switch (in.nextInt()) {
            case 1 -> '+';
            case 2 -> '-';
            case 3 -> '*';
            default -> 0;
        };
    }

    private static double calc(double num1, double num2, char operation) {
        return switch (operation) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            default -> 0;
        };
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
