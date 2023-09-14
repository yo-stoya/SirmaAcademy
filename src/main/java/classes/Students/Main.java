package classes.Students;

import java.util.*;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, List<Student>> students = new HashMap<>();
        String ln;

        while (!(ln = scanner.nextLine()).equals("end")) {
            final String[] tokens = ln.split("\\s+");
            final String city = tokens[3];
            students.putIfAbsent(city, new ArrayList<>());
            students.get(city).add(new Student(tokens[0], tokens[1], Integer.parseInt(tokens[2]), city));
        }

        final String city = scanner.nextLine();
        students.get(city).forEach(s -> System.out.println(s.getInfo()));
    }
}
