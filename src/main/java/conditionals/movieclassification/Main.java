package conditionals.movieclassification;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int age = Integer.parseInt(scanner.nextLine());

        String category = "All movies";

        if (age < 13) {
            category = "U-rated movies";
        } else if (age <= 17) {
            category = "U and PG-13 rated movies";
        }

        System.out.println(category);
    }
}
