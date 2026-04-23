/*
 * Program: Valid Mountain Array
 *
 * Problem Statement:
 * Check whether a given array is a valid mountain array.
 *
 * A mountain array must:
 * 1. Have at least 3 elements
 * 2. Strictly increase to a peak
 * 3. Then strictly decrease after the peak
 * 4. Peak cannot be first or last element
 *
 * Approach:
 * - Traverse upward until peak is reached
 * - Ensure peak is not at boundaries
 * - Traverse downward after peak
 * - If traversal ends at last index → valid mountain
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class ValidMountainArray {
    public static boolean isMountain(int[] arr) {
        int n = arr.length;

        // Step 1: array size must be at least 3
        if (n < 3) return false;

        int i = 0;

        // Step 2: climb up (increasing)
        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 3: peak should not be first or last
        if (i == 0 || i == n - 1) return false;

        // Step 4: climb down (decreasing)
        while (i < n - 1 && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 5: if reached end → valid mountain
        return i == n - 1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 4, 2};
        System.out.println(isMountain(arr)); // true
    }
}

