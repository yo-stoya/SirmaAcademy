package arrays.SumFirstandLastArrayElement;

import java.util.Arrays;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int[] nums = readArray(scanner.nextLine(), ",");
        final int sum = nums[0] + nums[nums.length - 1];
        System.out.println(sum);
    }


}
