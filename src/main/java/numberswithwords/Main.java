package numberswithwords;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        final int num = Integer.parseInt(scanner.nextLine());
        printNumberAsWord(num);
    }

    private static void printNumberAsWord(int num) {
        String res = switch (num) {
            case 0 -> "zero";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            case 4 -> "four";
            case 5 -> "five";
            case 6 -> "six";
            case 7 -> "seven";
            case 8 -> "eight";
            case 9 -> "nine";
            default -> "too big";
        };
        System.out.println(res);
    }
}
