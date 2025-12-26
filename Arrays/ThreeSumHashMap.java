import java.util.*;

public class ThreeSumHashMap {
    public static void main(String[] args) {
        int[] arr = {999,1,0,0,0,1002,-1,-1,-2,1000};
        int target = 1000;
        solution(arr, target, arr.length);
    }

    // HashMap Approach (O(n²) time, O(n)+O(m) space)
    public static void solution(int[] a, int target, int n) {
        Set<String> resultSet = new HashSet<>(); // Store unique triplets

        for (int i = 0; i < n; i++) {
            Map<Integer, Integer> map = new HashMap<>();

            for (int j = i + 1; j < n; j++) {
                int complement = target - a[i] - a[j];

                if (map.containsKey(complement)) {
                    // Found a triplet
                    int[] triplet = {a[i], complement, a[j]};
                    Arrays.sort(triplet);
                    String key = triplet[0] + "," + triplet[1] + "," + triplet[2];

                    if (!resultSet.contains(key)) {
                        resultSet.add(key);
                        System.out.println(a[i] + " " + complement + " " + a[j]);
                    }
                }

                map.put(a[j], j);
            }
        }
    }
}
