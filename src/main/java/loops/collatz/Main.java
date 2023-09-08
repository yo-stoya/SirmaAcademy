package loops.collatz;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        System.out.print(n + " ");

        while (n > 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n++;
            }
            System.out.print(n + " ");
        }
    }
}
