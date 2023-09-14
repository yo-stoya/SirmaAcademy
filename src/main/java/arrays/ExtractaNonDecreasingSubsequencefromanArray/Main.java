package arrays.ExtractaNonDecreasingSubsequencefromanArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int[] arr = readArray(scanner.nextLine(), ", ");

        int currMax = Integer.MIN_VALUE;
        List<Integer> sequence = new ArrayList<>();
        for (int j : arr) {
            if (j >= currMax) {
                currMax = j;
                sequence.add(j);
            }
        }

        for (int i : sequence) {
            System.out.print(i + " ");
        }

    }
}
