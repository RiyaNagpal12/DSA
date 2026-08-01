public class UpperBound {

    public static int indexUpperBound(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int ans = arr.length; // Default if no element is greater than target

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] > target) {
                ans = mid;        // Store index
                high = mid - 1;   // Search left half
            } else {
                low = mid + 1;    // Search right half
            }
        }

        return ans;
    }
