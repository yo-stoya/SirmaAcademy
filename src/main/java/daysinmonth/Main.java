package daysinmonth;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<Integer, Integer> months = new HashMap<>();

    static {
        months.put(1, 31);
        months.put(2, 28);
        months.put(3, 31);
        months.put(4, 30);
        months.put(5, 31);
        months.put(6, 30);
        months.put(7, 31);
        months.put(8, 31);
        months.put(9, 30);
        months.put(10, 31);
        months.put(11, 30);
        months.put(12, 31);
    }

    public static void main(String[] args) {
        final int month = Integer.parseInt(scanner.nextLine());
        System.out.println(months.get(month));
    }
}
