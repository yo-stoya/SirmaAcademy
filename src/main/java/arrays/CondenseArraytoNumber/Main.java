package arrays.CondenseArraytoNumber;

import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int[] arr = readArray(scanner.nextLine(), ",");

        if (arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i] + arr[i + 1];
        }

        System.out.println(sum);
    }


}
