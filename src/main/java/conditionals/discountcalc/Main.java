package conditionals.discountcalc;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int age = Integer.parseInt(scanner.nextLine());
        final String membership = scanner.nextLine();

        int discount = 30;

        if (age < 18) {
            discount = 10;
        } else if (age <= 64) {
            discount = membership.equals("Yes") ? 20 :  10;
        }

        System.out.println(discount +"% discount");
    }
}
