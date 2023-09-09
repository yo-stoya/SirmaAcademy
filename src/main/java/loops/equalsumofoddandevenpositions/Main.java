package loops.equalsumofoddandevenpositions;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int n = Integer.parseInt(scanner.nextLine());
        final int m = Integer.parseInt(scanner.nextLine());

        boolean hasMagicNumber = false;
        for (int i = n; i < m; i++) {
            if (compareDigits(i)) {
                hasMagicNumber = true;
                System.out.println(i);
            }
        }

        if (!hasMagicNumber) {
            System.out.println("None");
        }
    }

    private static boolean compareDigits(int num) {
        int sumEven = 0;
        int sumOdd = 0;
        int[] arr = fillArray(num);

        for (int j = 0; j < arr.length; j++) {
            if (j % 2 == 0) {
                sumEven += arr[j];
            } else {
                sumOdd += arr[j];
            }
        }

        return sumEven == sumOdd;
    }

    private static int[] fillArray(int num) {
        int[] arr = new int[6];

        int i = 0;
        while (num > 0) {
            arr[i] = num % 10;
            i++;
            num /= 10;
        }
        return arr;
    }
}
