package basicsyntax.kilometerstomiles;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final double km = Double.parseDouble(scanner.nextLine());
        final double milesConversion = 0.621371192;
        System.out.println(km * milesConversion);
    }
}
