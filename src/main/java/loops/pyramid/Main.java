package loops.pyramid;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int rows = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                if (count == rows) return;
                System.out.print(++count + " ");
            }
            System.out.println();
            
        }
    }
}
