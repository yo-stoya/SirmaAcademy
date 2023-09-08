package loops.factorial;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int num = Integer.parseInt(scanner.nextLine());
        long factorial = 1;

        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
