package potionbrewing;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final String ingredientOne = scanner.nextLine();
        final String ingredientTwo = scanner.nextLine();

        String potion = "Wander aimlessly";

        if (ingredientOne.equals("herbs")) {
            potion = ingredientTwo.equals("water") ?
                    "Health potion" : ingredientTwo.equals("oil") ?
                    "Stealth potion" : "Minor stamina potion";
        } else if (ingredientOne.equals("berries")) {
            potion = ingredientTwo.equals("sugar") ?
                    "Speed potion" : "Minor energy potion";
        }

        System.out.println(potion);
    }
}
