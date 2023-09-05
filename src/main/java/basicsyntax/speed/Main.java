package basicsyntax.speed;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int meters = Integer.parseInt(scanner.nextLine());
        final int hours = Integer.parseInt(scanner.nextLine());
        final int minutes = Integer.parseInt(scanner.nextLine());
        final int seconds = Integer.parseInt(scanner.nextLine());
        final double time = (hours * 3600) + (minutes * 60) + seconds;

        System.out.printf("%.6f", meters / time);
    }
}
