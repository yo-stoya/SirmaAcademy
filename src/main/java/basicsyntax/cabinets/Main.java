package basicsyntax.cabinets;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final double cabinetOne = Double.parseDouble(scanner.nextLine());
        final double cabinetTwo = cabinetOne * 0.8;
        final double cabinetThree = (cabinetOne + cabinetTwo) * 1.15;
        System.out.println(cabinetOne + cabinetTwo + cabinetThree);
    }
}
