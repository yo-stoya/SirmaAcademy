package dayofweek;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int day = Integer.parseInt(scanner.nextLine());
        printDayofWeek(day);
    }

    private static void printDayofWeek(int day) {
        String res = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Error";
        };

        System.out.println(res);
    }
}
