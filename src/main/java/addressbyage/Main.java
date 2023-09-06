package addressbyage;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int age =  Integer.parseInt(scanner.nextLine());
        final String sex = scanner.nextLine();

        String address = getAddress(age, sex);
        System.out.println(address);
    }

    private static String getAddress(int age, String sex) {

        String address = "Ms.";

        if (sex.equals("f")) {
            if (age < 16) {
                address = "Miss";
            }
        }

        if (sex.equals("m")) {
            address = age < 16 ? "Master" : "Mr.";
        }
        return address;
    }
}
