package classes.CarInfo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int n = Integer.parseInt(scanner.nextLine());

        List<Car> cars = new ArrayList<>();
        while (n-- > 0) {
            final String[] cmd = scanner.nextLine().split("\\s+");
            if (cmd.length == 3) {
                cars.add(new Car(cmd[0], cmd[1], Integer.parseInt(cmd[2])));
            } else if (cmd.length == 1) {
                cars.add(new Car(cmd[0]));
            } else if (cmd.length == 2) {
                cars.add(new Car(cmd[0], cmd[1]));
            }
        }


        for (Car car : cars) {
            System.out.println("Info: " + car.carInfo());
        }
    }
}
