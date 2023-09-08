package loops.fibonacci;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());
        int first = 1; int second = 1; int next;

        int sum = 2;
        for (int i = 3; i <= n; i++) {
            next = first + second;
            sum += next;
            first = second;
            second = next;
        }

        System.out.println(sum);
    }
}
