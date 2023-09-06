package conditionals.holiday;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    enum Continent {Bulgaria, Europe, Asia}
    enum Sites {Camp, Hotel}


    public static void main(String[] args) {

        final double budget = Double.parseDouble(scanner.nextLine());
        final String season = scanner.nextLine();

        Destination destination;

        if (budget <= 100) {
            destination = season.equals("summer") ?
                    new Destination(Continent.Bulgaria, budget * 0.30, Sites.Camp) :
                    new Destination(Continent.Bulgaria, budget * 0.70, Sites.Hotel);
        } else if (budget <= 1000) {
            destination = season.equals("summer") ?
                    new Destination(Continent.Europe, budget * 0.40, Sites.Camp) :
                    new Destination(Continent.Europe, budget * 0.80, Sites.Hotel);
        } else {
            destination = new Destination(Continent.Asia, budget * 0.90, Sites.Hotel);
        }

        String output = String.format("""
                Somewhere in %s
                %s - %.2f
                """, destination.getCountry(), destination.getSite(), destination.getPrice());

        System.out.println(output);
    }
}
