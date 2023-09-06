package conditionals.survivalwilderness;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final String timeOfDay = scanner.nextLine();
        final String environment = scanner.nextLine();
        final String item = scanner.nextLine();

        String action = "";

        if (timeOfDay.equals("day")) {
            if (environment.equals("forest")) {
                action = item.equals("knife") ? "Hunt for food" :
                        item.equals("container") ? "Collect berries" :
                                "Explore";
            } else if (environment.equals("dessert")) {
                action = item.equals("hat") ? "Search for water" : "Find shade";
            } else {
                action = "unknown environment";
            }
        } else if (timeOfDay.equals("night")) {
            if (environment.equals("forest")) {
                action = item.equals("firestarter") ? "Make campfire" : "Climb a tree for safety";
            } else if (environment.equals("dessert")) {
                action = item.equals("blanket") ? "Sleep" : "Keep moving to stay warm";
            } else {
                action = "unknown environment";
            }
        } else {
            action = "unknown time of day";
        }

        System.out.println(action);
    }
}
