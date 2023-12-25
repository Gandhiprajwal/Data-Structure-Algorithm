package Arrays;

import java.util.HashSet;

public class duplicateInteger {
    // Brute Force --> O(n^2)
    public static boolean duplicateNumberBrute(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // using Sets best Approach --> O(n)
    public static boolean duplicateInteger(int[] arr, int n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (set.contains(arr[i])) {
                return true;
            } else {
                set.add(arr[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
        // System.out.println(duplicateNumberBrute(arr, arr.length));
        System.out.println(duplicateInteger(arr, arr.length));
    }
}
