package conditionals.numbersinrange;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int mark = Integer.parseInt(scanner.nextLine());
        String output = isInRange(mark);
        System.out.println(output);
    }

    private static String isInRange(int mark) {
        return mark < -100 || mark == 0 || mark > 100 ? "No" : "Yes";
    }
}
