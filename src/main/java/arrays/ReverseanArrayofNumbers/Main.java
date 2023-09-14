package arrays.ReverseanArrayofNumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static arrays.ArrayUtil.readArray;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = Integer.parseInt(scanner.nextLine());
        final String[] array = Arrays.stream(scanner.nextLine().split(",")).limit(n).toArray(String[]::new);
        Collections.reverse(Arrays.asList(array));
        System.out.println(String.join(" ", array));

    }

}

