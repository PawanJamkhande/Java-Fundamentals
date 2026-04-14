package OOPS.Inheritance;

import java.util.Arrays;

public class Remove_duplication {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 3, 3, 4, 1};

        int[] uniarr = Arrays.stream(arr)
                             .distinct()
                             .toArray();

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(uniarr));
    }
}