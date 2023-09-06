package climatezone;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int latitude = Integer.parseInt(scanner.nextLine());
        final String hemisphere = scanner.nextLine();

        String zone = "Artic Zone";

        if (latitude == 0) {
            zone = "Equator";
        } else if (latitude < 23.5) {
            zone = "Tropic zone";
        } else if (latitude < 66.5) {
            zone = "Temperate zone";
        }

        System.out.println(zone);
    }
}
