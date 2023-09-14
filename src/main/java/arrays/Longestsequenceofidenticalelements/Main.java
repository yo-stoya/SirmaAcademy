package arrays.Longestsequenceofidenticalelements;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        final int[] arr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currSeq = 1;
        int maxSeq = 1;
        int idxSeq = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                currSeq++;
            } else {
                if (currSeq >= maxSeq) {
                    maxSeq = currSeq;
                    idxSeq = i;
                }
                currSeq = 1;
            }
        }

        for (int i = idxSeq - maxSeq; i < idxSeq ; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
