package grocery;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Map<String, Double>> cityProducts = new HashMap<>();

    static {
        cityProducts.put("Sofia", new HashMap<>());
        cityProducts.put("Plovdiv", new HashMap<>());
        cityProducts.put("Varna", new HashMap<>());

        var sofia = cityProducts.get("Sofia");
        sofia.put("coffee", 0.50);
        sofia.put("water", 0.80);
        sofia.put("juice", 1.20);
        sofia.put("sweets", 1.45);
        sofia.put("chips", 1.65);

        var plovdiv = cityProducts.get("Plovdiv");
        plovdiv.put("coffee", 0.40);
        plovdiv.put("water", 0.70);
        plovdiv.put("juice", 1.15);
        plovdiv.put("sweets", 1.30);
        plovdiv.put("chips", 1.50);

        var varna = cityProducts.get("Varna");
        varna.put("coffee", 0.45);
        varna.put("water", 0.70);
        varna.put("juice", 1.10);
        varna.put("sweets", 1.35);
        varna.put("chips", 1.55);
    }

    public static void main(String[] args) {

        final String product = scanner.nextLine();
        final String city = scanner.nextLine();
        final double quantity = Double.parseDouble(scanner.nextLine());

        final double productPrice = getProductPrice(product, city, quantity);
        System.out.printf("%.2f", productPrice);
    }

    private static Double getProductPrice(String product, String city, double quantity) {
        return cityProducts.get(city).get(product) * quantity;
    }
}
