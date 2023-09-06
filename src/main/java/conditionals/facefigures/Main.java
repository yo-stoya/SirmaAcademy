package conditionals.facefigures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Map<String, AreaCalculator> figures = addFigures();
        final String figure = scanner.nextLine();

        final double figureArea = figures.get(figure).getArea();
        System.out.printf("%.2f", figureArea);
    }

    private static Map<String, AreaCalculator> addFigures() {
        Map<String, AreaCalculator> figures = new HashMap<>();

        figures.put("square", () -> {
            final double side = Double.parseDouble(scanner.nextLine());
            return Math.pow(side, 2);
        });

        figures.put("rectangle", () -> {
            final double length = Double.parseDouble(scanner.nextLine());
            final double width = Double.parseDouble(scanner.nextLine());
            return length * width;
        });

        figures.put("triangle", () -> {
            final double base = Double.parseDouble(scanner.nextLine());
            final double height = Double.parseDouble(scanner.nextLine());
            return base * height / 2;
        });

        figures.put("circle", () -> {
            final double radius = Double.parseDouble(scanner.nextLine());
            return 2 * Math.PI * radius;
        });

        return figures;
    }
}
