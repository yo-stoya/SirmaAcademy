package loops.numswithjumpm;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int end = Integer.parseInt(scanner.nextLine());
        int step = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= end; i+=step) {
            System.out.println(i);
        }
    }
}
