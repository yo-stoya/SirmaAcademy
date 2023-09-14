package arrays.SumEvenNumbers;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int sum = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .filter(i -> i % 2 == 0)
                .sum();

        System.out.println(sum);


    }


}
