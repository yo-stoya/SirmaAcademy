package loops.numsjump2;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int end = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= end; i+=2) {
            System.out.println(i);
        }
    }
}
