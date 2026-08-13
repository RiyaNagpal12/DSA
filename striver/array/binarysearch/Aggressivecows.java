import java.util.Arrays;

class Solution {

    public static boolean canPlace(int arr[], int minDis, int cows) {

        int countCows = 1;
        int placed = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] - placed >= minDis) {
                countCows++;
                placed = arr[i];
            }
        }

        return countCows >= cows;
    }

    public static int aggressiveCows(int cow[], int cows) {

        Arrays.sort(cow);

        int low = 1;
        int high = cow[cow.length - 1] - cow[0];

        int ans = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (canPlace(cow, mid, cows)) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
    
