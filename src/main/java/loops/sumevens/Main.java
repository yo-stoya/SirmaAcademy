package loops.sumevens;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int end = 0;

       for (int j = 2; end < n; j += 2) {
            sum += j;
            end++;
        }

        System.out.println(sum);
    }
}
