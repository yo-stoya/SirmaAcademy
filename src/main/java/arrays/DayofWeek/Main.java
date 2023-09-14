package arrays.DayofWeek;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    private static final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    public static void main(String[] args) {

        final int i = Integer.parseInt(scanner.nextLine());

        if (i < 0 || i > days.length - 1) {
            System.out.println("Invalid day!");
            return;
        }

        System.out.println(days[i]);
    }


}
