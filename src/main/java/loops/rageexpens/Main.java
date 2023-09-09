package loops.rageexpens;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int games = Integer.parseInt(scanner.nextLine());
        double priceHeadset = Double.parseDouble(scanner.nextLine());
        double priceMouse = Double.parseDouble(scanner.nextLine());
        double priceKeyboard = Double.parseDouble(scanner.nextLine());
        double priceDisplay = Double.parseDouble(scanner.nextLine());

        int trashedMice = games / 3;
        int trashedHeadsets = games / 2;
        int trashedKeyboards = 0;
        int trashedDisplays = 0;

        for (int i = 1; i <= games; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                trashedKeyboards++;
                if (trashedKeyboards % 2 == 0) {
                    trashedDisplays++;
                }
            }
        }

        double expenses = calcExpenses(priceHeadset, priceMouse,
                priceKeyboard, priceDisplay,
                trashedMice, trashedHeadsets,
                trashedKeyboards, trashedDisplays);
        System.out.printf("Rage expenses: %.2f lv.%n", expenses);
    }

    private static double calcExpenses(double priceHeadset, double priceMouse, double priceKeyboard, double priceDisplay, int trashedMice, int trashedHeadsets, int trashedKeyboards, int trashedDisplays) {
        return (trashedKeyboards * priceKeyboard) +
        (trashedHeadsets * priceHeadset) +
        (trashedMice * priceMouse) +
        (trashedDisplays * priceDisplay);
    }
}
