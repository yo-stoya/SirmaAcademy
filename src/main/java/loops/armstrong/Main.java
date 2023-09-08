package loops.armstrong;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String input = scanner.nextLine();
        final int power = input.length();
        int num = Integer.parseInt(input);
        int origin = num;

        int sumDigits = 0;
        while (num > 0) {
            final int digit = num % 10;
            sumDigits += Math.pow(digit, power);
            num /= 10;
        }

        System.out.println(origin == sumDigits);
    }
}
