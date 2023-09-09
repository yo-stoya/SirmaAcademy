package loops.numbersinrangeending;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = Integer.parseInt(scanner.nextLine());

        for (int i = n; i < 100; i+=10) {
            System.out.println(i);
        }
    }
}
