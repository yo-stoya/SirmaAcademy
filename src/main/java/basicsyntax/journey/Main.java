package basicsyntax.journey;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int speedCarX = Integer.parseInt(scanner.nextLine());
        final int speedCarY = Integer.parseInt(scanner.nextLine());
        System.out.println((5 * speedCarX) - (3 * speedCarY));
    }
}
