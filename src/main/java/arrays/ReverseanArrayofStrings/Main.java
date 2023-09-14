package arrays.ReverseanArrayofStrings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.SimpleTimeZone;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String[] arr = Arrays.stream(scanner.nextLine().split(",")).toArray(String[]::new);
        for (int i = 0; i < arr.length / 2; i++) {
            String left = arr[i];
            String right = arr[arr.length - 1 - i];
            arr[i] = right;
            arr[arr.length - 1 - i] = left;
        }

        System.out.println(String.join(" ", arr));

    }


}
