package loops.coins;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int coins1lv = Integer.parseInt(scanner.nextLine());
        int coins2lv = Integer.parseInt(scanner.nextLine());
        int banknotes5lv = Integer.parseInt(scanner.nextLine());
        int amount = Integer.parseInt(scanner.nextLine());


        for (int c1 = 0; c1 <= coins1lv; c1++) {
            for (int c2 = 0; c2 <= coins2lv; c2++) {
                for (int b = 0; b <= banknotes5lv; b++) {
                    if (c1 + c2 * 2 + b * 5 == amount) {
                        System.out.printf("%d * 1 lv. + %d * 2 lv. + %d * 5 lv. = %d lv.%n", c1, c2, b, amount);
                    }
                }
                
            }
            
        }
    }
}
