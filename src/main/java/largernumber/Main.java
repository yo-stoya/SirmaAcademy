package largernumber;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int numOne = Integer.parseInt(scanner.nextLine());
        final int numTwo = Integer.parseInt(scanner.nextLine());
        printLargerInt(numOne, numTwo);
    }

    private static void printLargerInt(int numOne, int numTwo) {
        System.out.println(Math.max(numOne, numTwo));
    }
}
