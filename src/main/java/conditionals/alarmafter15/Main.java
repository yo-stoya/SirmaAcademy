package conditionals.alarmafter15;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int hours = Integer.parseInt((scanner.nextLine()));
        final int minutes = Integer.parseInt((scanner.nextLine()));

        setAlarmIn15m(hours, minutes);

    }

    private static void setAlarmIn15m(int hours, int minutes) {

        int alarmMinutes = minutes + 15;
        int alarmHours = hours;

        if (alarmMinutes > 59) {
            alarmMinutes %= 60;
            alarmHours++;
        }

        if (alarmHours > 23) {
            alarmHours = 0;
        }

//        DecimalFormat df = new DecimalFormat("#00");
//        System.out.println(alarmHours + ":" + df.format(alarmMinutes));

        System.out.printf("%d:%02d", alarmHours, alarmMinutes);
    }
}
