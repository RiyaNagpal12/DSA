```java
public class Solution {

    // Find maximum pile
    public static int maxPile(int[] piles) {
        int max = piles[0];

        for (int i = 0; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }

        return max;
    }

    // Calculate total hours needed at speed h
    public static int calculateHours(int[] piles, int h) {
        int totalH = 0;

        for (int i = 0; i < piles.length; i++) {
            totalH += Math.ceil((double) piles[i] / h);
        }

        return totalH;
    }

    // Find minimum eating speed
    public static int leastHours(int[] piles, int h) {

        int low = 1;
        int high = maxPile(piles);

        while (low <= high) {

            int mid = low + (high - low) / 2;

            int totalH = calculateHours(piles, mid);

            if (totalH <= h) {
                // Speed is possible, try smaller speed
                high = mid - 1;
            } else {
                // Speed is too slow, increase speed
                low = mid + 1;
            }
        }

        return low;
    }
}
```
