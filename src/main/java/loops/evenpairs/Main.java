package loops.evenpairs;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int firstPair = Integer.parseInt(scanner.nextLine());
        int secondPair = Integer.parseInt(scanner.nextLine());
        int differenceFP = Integer.parseInt(scanner.nextLine());
        int differenceSP = Integer.parseInt(scanner.nextLine());

        for (int i = firstPair; i <= firstPair + differenceFP ; i++) {
            for (int j = secondPair; j < secondPair + differenceSP ; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.println(i + "" + j);
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
