package basicsyntax.waterconsumption;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int weeklyWaterConsumption = Integer.parseInt(scanner.nextLine());
        final int people = Integer.parseInt(scanner.nextLine());
        final double dailyWaterConsumption = (double) weeklyWaterConsumption / (7 * people);
        System.out.printf("%.2f", dailyWaterConsumption);
    }
}
