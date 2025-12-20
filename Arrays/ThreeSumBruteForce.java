import java.util.*;

public class ThreeSumBruteForce {
    public static void main(String[] args) {
        int[] arr = {7, -6, 3, 8, -1, 8, -11, 0, 3};
        int target = 0;
        solution(arr, target, arr.length);
    }

    // Brute Force Approach (O(n³) time, O(1) space)
    public static void solution(int[] a, int target, int n) {
        Set<String> seen = new HashSet<>(); // To avoid duplicate triplets

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == target) {
                        // Store in sorted order to avoid duplicates
                        int[] triplet = {a[i], a[j], a[k]};
                        Arrays.sort(triplet);
                        String key = triplet[0] + "," + triplet[1] + "," + triplet[2];

                        if (!seen.contains(key)) {
                            seen.add(key);
                            System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        }
                    }
                }
            }
        }
    }
}
