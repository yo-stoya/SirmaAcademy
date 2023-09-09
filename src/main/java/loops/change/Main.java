package loops.change;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double amount = Double.parseDouble(scanner.nextLine()) * 100;

        int[] coins = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int counter = 0;

        for (int coin : coins) {
            if (amount >= coin) {
                amount -= coin;
                counter++;
            }
        }

        System.out.println(counter);

    }

}
