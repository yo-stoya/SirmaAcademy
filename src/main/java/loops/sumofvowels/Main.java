package loops.sumofvowels;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<Character, Integer> vowels = new HashMap<>();
        vowels.put('a', 1);
        vowels.put('e', 2);
        vowels.put('i', 3);
        vowels.put('o', 4);
        vowels.put('u', 5);

        final String word = scanner.nextLine();
        int sumVowels = 0;

        for (int i = 0; i < word.length(); i++) {
            final char c = word.charAt(i);
            final Integer vowelValue = vowels.getOrDefault(c, 0);
            sumVowels += vowelValue;
        }

        System.out.println(sumVowels);
    }
}
