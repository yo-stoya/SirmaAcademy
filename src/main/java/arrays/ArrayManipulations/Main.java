package arrays.ArrayManipulations;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        final int[] arr = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .sorted().toArray();

        final List<String> cmds = Arrays.stream(scanner.nextLine().split(", ")).toList();

        for (String cmd : cmds) {
            final String[] tokens = cmd.split("\\s+");
            final String action = tokens[0];
            final int value = Integer.parseInt(tokens[1]);
            switch (action) {
                case "Add" -> add(arr, value);
                case "Remove" -> remove(arr, value);
                case "RemoveAt" -> removeAt(arr, value);
                case "Insert" -> {
                    final int idx = Integer.parseInt(tokens[2]);
                    insertAt(arr, value, idx);
                }
            }
        }
    }

    private static void insertAt(int[] arr, int value, int idx) {
        arr = Arrays.copyOf(arr, arr.length + 1);

        for (int i = idx; i < arr.length - 1 ; i++) {
            arr[i] = arr[i + 1];
        }
        arr[idx] = value;
    }

    private static void removeAt(int[] arr, int value) {
        int[] reduced = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i != value) {
                reduced[idx] = arr[i];
                idx++;
            }
        }

        arr = reduced;
    }

    private static void remove(int[] arr, int value) {
        int[] reduced = new int[arr.length - 1];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != value) {
                reduced[idx] = arr[i];
                idx++;
            }
        }

        arr = reduced;
    }

    private static void add(int[] arr, int value) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = value;
    }
}
