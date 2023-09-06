package basicsyntax.averagespeed;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int distance = Integer.parseInt(scanner.nextLine());
        final int time = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", (double) distance / time);
    }
}
