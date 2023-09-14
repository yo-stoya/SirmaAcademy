package arrays.FirstandLastKNumbers;

import java.nio.file.LinkOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int k = Integer.parseInt(scanner.nextLine());
        final int[] arr = readArray(scanner.nextLine(), ", ");

        int[] first = new int[k];
        for (int i = 0; i < k ; i++) {
            first[i] = (arr[i]);
        }

        int[] last = new int[k];
        for (int i = 0; i < arr.length - 1; i++) {
            last[i] = (arr[arr.length - k + i]);
        }

        printArr(first);
        System.out.println();
        printArr(last);
    }

    private static void printArr(int[] first) {
        for (int i : first) {
            System.out.print(i + " ");
        }
    }
}
