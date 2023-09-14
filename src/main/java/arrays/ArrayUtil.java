package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArrayUtil {

    public static int[] readArray(String line, String reg) {
        return Arrays.stream(line.split(reg)).mapToInt(Integer::parseInt).toArray();
    }

}
