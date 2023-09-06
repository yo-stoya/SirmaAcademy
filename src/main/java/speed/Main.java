package speed;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final double speed = Double.parseDouble(scanner.nextLine());
        String output = getSpeed(speed);
        System.out.println(output);
    }

    private static String getSpeed(double speed) {

        String output = "turbo-fast";

        if (speed <= 10) {
            output = "slow";
        } else if (speed <= 60) {
            output = "average";
        } else if (speed <= 120) {
            output = "fast";
        } else if (speed <= 160) {
            output = "super-fast";
        }

        return output;
    }
}
