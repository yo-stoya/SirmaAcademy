package loops.reversenumber;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num = Integer.parseInt(scanner.nextLine());
        while (num > 0) {
            System.out.printf("%d", num % 10);
            num /= 10;
        }
    }
}
