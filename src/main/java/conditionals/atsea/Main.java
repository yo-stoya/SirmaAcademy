package conditionals.atsea;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Double> rooms = new HashMap<>();

    static  {
        rooms.put("single room", 25.0);
        rooms.put("apartment", 50.0);
        rooms.put("presidential", 100.0);
    }

    public static void main(String[] args) {

        final int days = Integer.parseInt(scanner.nextLine());
        final String room = scanner.nextLine();
        final String review = scanner.nextLine();

        final int nights = days - 1;
        double price = nights * rooms.get(room);

        price *= getDiscount(nights, room);
        price *= getReviewDiscount(review);

        System.out.printf("%.2f", price);
    }

    private static double getReviewDiscount(String review) {
        return review.equals("positive") ? 1.25 : 0.9;
    }

    private static double getDiscount(int nights, String room) {
        double discount = 0;

        if (room.equals("apartment")) {
            if (nights < 10) {
                discount = 0.70;
            } else if (nights <= 15) {
                discount = 0.65;
            } else {
                discount = 0.5;
            }
        } else if (room.equals("presidential")) {
            if (nights < 10) {
                discount = 0.10;
            } else if (nights <= 15) {
                discount = 0.15;
            } else {
                discount = 0.2;
            }
        }
        return discount;
    }
}
