package evenorodd;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int number = Integer.parseInt(scanner.nextLine());
        printEvenOrOdd(number);
    }

    private static void printEvenOrOdd(int number) {
        final String isEven = number % 2 == 0 ? "even" : "odd";
        System.out.println(isEven);
    }
}
