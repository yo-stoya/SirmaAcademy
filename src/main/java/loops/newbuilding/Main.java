package loops.newbuilding;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int floors = Integer.parseInt(scanner.nextLine());
        int apts = Integer.parseInt(scanner.nextLine());

        for (int i = floors; i > 0; i--) {
            for (int j = 0; j < apts; j++) {
                if (i == floors) {
                    System.out.print("L" + i + j + " ");
                }
                isOffice(floors, i, j);
                isApartment(i, j);
            }
            System.out.println();
        }


    }

    private static void isApartment(int i, int j) {
        if (i % 2 != 0) {
            System.out.print("A" + i + j + " ");
        }
    }

    private static void isOffice(int floors, int i, int j) {
        if (i != floors && i % 2 == 0) {
            System.out.print("O" + i + j + " ");
        }
    }
}
