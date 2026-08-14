public class Solution {

    public static int countPainters(int boards[], int maxTime) {

        int painters = 1;
        int time = 0;

        for (int i = 0; i < boards.length; i++) {

            if (time + boards[i] <= maxTime) {
                time += boards[i];
            } 
            else {
                painters++;
                time = boards[i];
            }
        }

        return painters;
    }

    public static int painterPartition(int boards[], int painters) {

        int low = Integer.MIN_VALUE;
        int high = 0;

        // Search space
        for (int i = 0; i < boards.length; i++) {
            low = Math.max(low, boards[i]);
            high += boards[i];
        }

        // Binary Search
        while (low <= high) {

            int mid = low + (high - low) / 2;

            int requiredPainters = countPainters(boards, mid);

            if (requiredPainters > painters) {
                // mid is too small
                low = mid + 1;
            } 
            else {
                // mid is possible, try smaller
                high = mid - 1;
            }
        }

        return low;
    }
}
