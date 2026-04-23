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

