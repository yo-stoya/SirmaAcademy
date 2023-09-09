package loops.uniquecodes;

import java.util.Scanner;


public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= firstN; i++) {
            for (int j = 1; j <= secondN; j++) {
                for (int k = 1; k <= thirdN; k++) {
                    if (i % 2 == 0 && k % 2 == 0 && isPrime(j)) {
                        System.out.println(i + " " + j + " " + k);
                    }
                }
            }
            
        }

    }

    private static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int j = 2; j < number; j++) {
            if (number % j == 0) return false;
        }

        return true;
    }
}
