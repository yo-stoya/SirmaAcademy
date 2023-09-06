package gradecalculator;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int pct = Integer.parseInt(scanner.nextLine());

        char grade = 'A';
        if (pct <= 59) {
            grade = 'F';
        } else if (pct <= 69) {
            grade = 'D';
        } else if (pct <= 79) {
            grade = 'C';
        } else if (pct <= 89) {
            grade = 'B';
        }

        System.out.println(grade);

    }
}
