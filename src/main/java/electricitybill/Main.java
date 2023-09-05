package electricitybill;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int FIXED_RATE = 10;

    public static void main(String[] args) {
        final int unitsConsumed = Integer.parseInt(scanner.nextLine());
        final double unitRate = Double.parseDouble(scanner.nextLine());
        final double electricBill = (double) unitsConsumed * unitRate + FIXED_RATE;
        System.out.println(electricBill);
    }
}
