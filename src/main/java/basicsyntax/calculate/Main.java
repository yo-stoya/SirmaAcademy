package basicsyntax.calculate;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int numOne = scanner.nextInt();
        final int numTwo = scanner.nextInt();
        final int sum = numOne + numTwo;

        final String output =
                String.format("""
                        The sum is: %d
                        The difference is: %d
                        The product is: %d
                        The average is: %f
                        """, sum,
                numOne - numTwo,
                numOne * numTwo,
                sum / 2.0);

        System.out.println(output);
    }
}
