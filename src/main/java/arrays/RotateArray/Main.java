package arrays.RotateArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String[] arr = Arrays.stream(scanner.nextLine().split(",")).toArray(String[]::new);

        final int n = Integer.parseInt(scanner.nextLine());

        String[] rotated = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
            rotated[(i + n) % arr.length] = arr[i];
        }

        System.out.println(String.join(" ", rotated));
    }


}
