package conditionals.simplecalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    enum Operations {add, subtract, divide, multiply}

    public static void main(String[] args) {

        final double x = Double.parseDouble(scanner.nextLine());
        final double y = Double.parseDouble(scanner.nextLine());
        final Operations operation = Operations.valueOf(scanner.nextLine());

        final double result = applyOperation(x, y, operation);
        System.out.printf("%.2f", result);


    }

    private static double applyOperation(double x, double y, Operations operation) {
        return switch (operation) {
            case add -> x + y;
            case subtract -> x - y;
            case divide -> x / y;
            case multiply -> x * y;
        };
    }
}
