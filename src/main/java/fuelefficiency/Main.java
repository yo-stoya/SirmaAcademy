package fuelefficiency;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int distance = Integer.parseInt(scanner.nextLine());
        final int fuel = Integer.parseInt(scanner.nextLine());
        final double fuelEfficiency = (double) distance / fuel;
        System.out.printf("%.2f", fuelEfficiency);
    }
}
