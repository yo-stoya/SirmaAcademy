package vegetablemarket;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    enum Days {Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday}

    enum Veggies {
        tomato(2.50, 2.80),
        onion(1.20, 1.30),
        lettuce(0.85, 0.85),
        cucumber(1.45, 1.75),
        pepper(5.50, 3.50);

        private final double weekdayPrice;
        private final double weekendPrice;

        Veggies(double weekdayPrice, double weekendPrice) {
            this.weekdayPrice = weekdayPrice;
            this.weekendPrice = weekendPrice;
        }

        public double getWeekdayPrice() {
            return weekdayPrice;
        }

        public double getWeekendPrice() {
            return weekendPrice;
        }
    }

    public static void main(String[] args) {


        try {
            final Veggies vegetable = Veggies.valueOf(scanner.nextLine());
            final Days dayOfWeek = Days.valueOf(scanner.nextLine());
            final double quantity = Double.parseDouble(scanner.nextLine());

            final double price = getVeggiePrice(vegetable, dayOfWeek, quantity);
            System.out.printf("%.2f", price);

        } catch (IllegalArgumentException e) {
            System.out.println("error");
        }

    }

    private static double getVeggiePrice(Veggies vegetable, Days dayOfWeek, double quantity) {
        return switch (dayOfWeek) {
            case Saturday, Sunday -> vegetable.getWeekendPrice() * quantity;
            default -> vegetable.getWeekdayPrice() * quantity;
        };
    }
}
