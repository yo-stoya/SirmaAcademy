package conditionals.universityadmissions;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        final int score = Integer.parseInt(scanner.nextLine());
        final int extracurriculars = Integer.parseInt(scanner.nextLine());

        String admitted = "Not admitted";

        if (80 <= score && score <= 89 && extracurriculars >= 2) {
            admitted = "Admitted";
        } else if (score >= 90) {
            admitted = "Admitted";
        }

        System.out.println(admitted);
    }
}
