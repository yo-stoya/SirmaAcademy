package bmi;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int weight = Integer.parseInt(scanner.nextLine());
        final double height = Double.parseDouble(scanner.nextLine());
        final double bmi = weight / Math.pow(height, 2);
        System.out.printf("%.2f", bmi);
    }
}
