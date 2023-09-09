package loops.encoding;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String input = scanner.nextLine();
        final int lines = input.length();
        int n = Integer.parseInt(input);

        for (int i = 0; i < lines; i++) {
            int digit = n % 10;
            n /= 10;

            for (int j = 0; j < digit; j++) {
                System.out.print(((char) (digit + 33)));
            }

            if (digit == 0) {
                System.out.println("ZERO");
            } else {
                System.out.println();
            }
        }

    }
}
