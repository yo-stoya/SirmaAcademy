package loops.specialnumbers;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n ; j++) {
                for (int k = 1; k <= n ; k++) {
                    for (int l = 1; l <= n ; l++) {
                        if (n % i == 0 && n % j == 0 && n % k == 0 && n % l == 0) {
                            System.out.printf("%d%d%d%d%n", i,j,k,l);
                        }
                    }
                }
            }
        }

    }
}
