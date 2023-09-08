package loops.magicnumber;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int number = Integer.parseInt(scanner.nextLine());

        int count = 0;
        boolean found = false;
        for (int i = start; i <= end ; i++) {
            for (int j = start; j <= end ; j++) {
                count++;
                if (i + j == number) {
                    found = true;
                    System.out.printf("Combination %d, (%d + %d = %d)%n", count, i, j, number);
                }
            }
        }

        if (!found) {
            System.out.printf("%d combination neither equals %d%n", count, number);
        }

    }
}
