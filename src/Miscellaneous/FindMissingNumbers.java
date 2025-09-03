package Miscellaneous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumbers {
    public static void main(String[] args) {
        int[] ar = {1, 0, 3, 8, 6};

        int max = Arrays.stream(ar).max().getAsInt();

        // Use a set to track present numbers
        Set<Integer> present = new HashSet<>();
        for (int num : ar) {
            if (num >= 0) present.add(num);
        }

        // Print missing numbers in [0...max]
        for (int i = 0; i <= max; i++) {
            if (!present.contains(i)) {
                System.out.println("Missing: " + i);
            }
        }
    }
}
