package loops.passwordgenerator;

import java.util.Scanner;

public class Main {
    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int n = Integer.parseInt(scanner.nextLine());
        final int m = Integer.parseInt(scanner.nextLine());
        final StringBuilder sb = new StringBuilder();

        for (int i = 1; i < n; i++) {
            sb.append(i);
            for (int j = 1; j < n; j++) {
                sb.append(j);
                for (char k = 0; k < m; k++) {
                    sb.append((char) (97 + k));
                    for (char o = 0; o < m; o++) {
                        sb.append((char) (97 + o));
                        for (int p = 1; p <= n; p++) {
                            if (p > i && p > j) {
                                sb.append(p);
                                System.out.println(sb);
                                sb.setLength(4);
                            }
                        }
                        sb.setLength(3);
                    }
                    sb.setLength(2);
                }
                sb.setLength(1);
            }
            sb.setLength(0);
        }
    }
}
