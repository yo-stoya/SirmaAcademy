package arrays.EvenandOddSubtraction;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int[] arr1 = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        final int[] arr2 = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt).toArray();

        if (arr1.length != arr2.length) {
            System.out.println("Arrays are not identical!");
            return;
        }

        boolean areEqual = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                areEqual = false;
                System.out.printf("Arrays are not identical. Found difference at %d index%n", i);
                break;
            }
        }

        if (areEqual) {
            System.out.println("Arrays are identical. Sum: " + Arrays.stream(arr1).sum());
        }
    }


}
