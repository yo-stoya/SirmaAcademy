package loops.refactorsumofodd;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int counter = 1;
        for (int i = 1; counter <= n; i += 2) {
            System.out.println(i);
            sum += i;
            counter++;
        }

        System.out.printf("Sum: %d%n", sum);
    }
}
