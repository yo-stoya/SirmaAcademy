package makeupshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Double> makeup = new HashMap<>();
    static {
        makeup.put("powder", 2.60);
        makeup.put("lipstick", 3.0);
        makeup.put("spiral", 4.10);
        makeup.put("shadows", 8.20);
        makeup.put("concealer", 2.0);
    }
    public static void main(String[] args) {

        final double renovation = Double.parseDouble(scanner.nextLine());
        final int powders = Integer.parseInt(scanner.nextLine());
        final int lipsticks = Integer.parseInt(scanner.nextLine());
        final int spirals = Integer.parseInt(scanner.nextLine());
        final int shadows = Integer.parseInt(scanner.nextLine());
        final int correctors = Integer.parseInt(scanner.nextLine());

        final double sumMakeup = powders + lipsticks + spirals + shadows + correctors;
        double profit = makeup.get("powder") * powders + makeup.get("lipstick") * lipsticks + makeup.get(
                "spiral") * spirals + makeup.get("shadown") * shadows + makeup.get("concealer") * correctors;

        if (sumMakeup >= 50) {
            profit *= 0.75;
        }

        // pay rent
        profit *= 0.9;

        String isMoneyEnough = renovation <= profit ?
                "Yes, %.2f lv left." :
                "Not enough money! %.2f lv needed.";

        System.out.printf(isMoneyEnough, Math.abs(renovation - profit));
    }
}
