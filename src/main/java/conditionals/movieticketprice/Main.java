package conditionals.movieticketprice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        Map<String, Integer> prices = new HashMap<>();
        prices.put("child", 5);
        prices.put("teen", 8);
        prices.put("adult", 10);

        final int age = Integer.parseInt(scanner.nextLine());

        int price = prices.get("adult");

        if (age <= 12) {
            price = prices.get("child");
        } else if (age <= 19) {
            price = prices.get("teen");
        }

        System.out.println("$" + price);
    }
}
