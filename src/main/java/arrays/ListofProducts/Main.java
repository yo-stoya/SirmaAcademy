package arrays.ListofProducts;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String[] arr = Arrays
                .stream(scanner.nextLine()
                .split(", "))
                .sorted()
                .toArray(String[]::new);

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d. %s%n", i+1, arr[i]);
        }

    }


}
