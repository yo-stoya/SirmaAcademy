package loops.palindrome;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String word = scanner.nextLine();
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - i  - 1)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome);
    }
}
