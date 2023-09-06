package architectualera;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int year = Integer.parseInt(scanner.nextLine());
        final String material = scanner.nextLine();

        String architecture = "Uncertain";

        if (year < 500 && material.equals("stone")) architecture = "Ancient";
         else if (500 <= year && year <= 1500 && material.equals("stone")) architecture = "Medieval";
         else if (1500 <= year && year <= 1800 && material.equals("wood")) architecture = "Colonial";
         else if (1800 <= year && year <= 1900 && material.equals("steel")) architecture = "Industrial";
         else if (year > 1900 && material.equals("steel")) architecture = "Modern";

        System.out.println(architecture);
    }
}
