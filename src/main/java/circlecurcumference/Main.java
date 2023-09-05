package circlecurcumference;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final double circleCircumference = 2 * Math.PI * Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", circleCircumference);
    }
}
