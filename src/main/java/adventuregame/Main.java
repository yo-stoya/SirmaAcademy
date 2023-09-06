package adventuregame;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String leftHand = scanner.nextLine();
        final String rightHand = scanner.nextLine();

        String path = "Wander aimlessly";

        if (leftHand.equals("sword")) {
            path = rightHand.equals("shield") ? "Path to the castle" : "Path to the forest";
        } else if (leftHand.equals("map")) {
            path = rightHand.equals("coins") ? "Go to the town" : "Camp on spot";
        }

        System.out.println(path);
    }
}
