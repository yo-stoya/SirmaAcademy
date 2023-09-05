package basicsyntax.time;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int minutes = Integer.parseInt(scanner.nextLine());
        System.out.printf("%02d:%02d", minutes / 60, minutes % 60);
    }
}
