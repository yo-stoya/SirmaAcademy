package marks;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final double MARK_THRESHOLD = 5.50;

    public static void main(String[] args) {

        final double mark = Double.parseDouble(scanner.nextLine());

        String output = mark >= MARK_THRESHOLD ? "Excellent!" : "no output";
        System.out.println(output);
    }
}
