package basicsyntax.painting;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int paint = Integer.parseInt(scanner.nextLine());
        final double r = paint / 13.0;
        final double y = 4 * r;
        final double w = y * 2;

        System.out.printf("""
                        Red: %.4f
                        Yellow: %.4f
                        White: %.4f
                        """,
                r, y, w);
    }
}
