package arrays.ProcessOddNumbers;

import java.util.*;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int[] arr = readArray(scanner.nextLine(), ", ");

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i < arr.length; i += 2) {
            final int value = arr[i];
            nums.add(value + value);
        }

        Collections.reverse(nums);
        nums.forEach(e -> System.out.print(e + " "));
    }
}
