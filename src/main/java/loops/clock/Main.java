package loops.clock;

public class Main {
    public static void main(String[] args) {

        int hours = 0;
        int minutes = 0;

        while (hours < 24) {
            while (minutes < 59) {
                System.out.printf("%01d:%01d%n", hours, ++minutes);
            }
            minutes = 0;
            System.out.printf("%01d:%02d%n", ++hours, minutes);
        }
    }
}
