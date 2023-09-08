package loops.numsreversed;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int i = Integer.parseInt(scanner.nextLine());
        while (i > -1) {
            System.out.println(i);
            i--;
        }
    }
}
