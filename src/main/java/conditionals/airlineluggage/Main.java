package conditionals.airlineluggage;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int weight = Integer.parseInt(scanner.nextLine());
        final int dimensions = Integer.parseInt(scanner.nextLine());

        int charges = 0;
        boolean isOverweight = false;
        boolean isOversize = false;


        String chargesDesc = " ";
        if (weight > 50) {
            isOverweight = true;
            chargesDesc += "(Overweight)";
            charges += 100;
        }

        if (dimensions > 158) {
            isOversize = true;

            final int oversize = dimensions - 158;

            if (oversize <= 20) {
                chargesDesc = chargesDesc.replace(")", " + slightly Oversize)");
                charges += 50;
            } else if (oversize <= 50) {
                chargesDesc = chargesDesc.replace(")", " + Oversize)");
                charges += 100;
            } else {
                chargesDesc = chargesDesc.replace(")", " + Oversize + Handling)");
                charges += 200;
            }
        }

        charges += isOverweight && isOversize ? 50 : 0;
        String output = "$" + charges + chargesDesc;
        System.out.println(output);
    }
}
