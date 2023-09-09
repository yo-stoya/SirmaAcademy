package loops.padawan;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double budget = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double priceSaber = Double.parseDouble(scanner.nextLine());
        double priceRobe = Double.parseDouble(scanner.nextLine());
        double priceBelt = Double.parseDouble(scanner.nextLine());

        final int freeBelts = students / 6;
        final double totalSabers = Math.ceil(students * 1.10);
        final double totalPrice =
                (students * priceRobe) + (totalSabers * priceSaber) + ((students - freeBelts) * priceBelt);

        String res = budget >= totalPrice ? String.format("The money is enough - it would cost %.2f lv.",
                totalPrice) : String.format("George Lucas will need %.2f lv more.", totalPrice - budget);

        System.out.println(res);

    }
}
