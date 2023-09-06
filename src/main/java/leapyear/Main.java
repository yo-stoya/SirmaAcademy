package leapyear;

import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int year = Integer.parseInt(scanner.nextLine());
        final boolean isLeap = year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
        System.out.println(isLeap ? "It's a leap year!" : "It's not a leap year.");
    }
}
