package arrays.AddandRemoveElementsfromArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String[] cmds = Arrays.stream(scanner.nextLine().split(",")).toArray(String[]::new);

        int i = 1;
        int[] nums = {};
        for (String cmd : cmds) {
            if (cmd.equals("add")) {
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = i;
                i++;
            } else {
                if (nums.length == 0) {
                    System.out.println("Empty");
                    return;
                }
                nums = Arrays.copyOf(nums, nums.length - 1);
            }
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

    }


}
