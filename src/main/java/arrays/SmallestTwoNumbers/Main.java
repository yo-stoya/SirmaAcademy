package arrays.SmallestTwoNumbers;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int[] arr = readArray(scanner.nextLine(), ", ");
        Arrays.stream(arr).sorted().limit(2).forEach(e -> System.out.print(e + " "));
    }


}
