package arrays.PrinteveryNthElementfromanArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String[] arr = Arrays.stream(scanner.nextLine().split(",")).toArray(String[]::new);
        final int step = Integer.parseInt(scanner.nextLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i+=step) {
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }


}
