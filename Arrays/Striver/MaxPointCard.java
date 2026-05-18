public class MaxPointCard {

    public static int MaxPoint(int arr[], int k) {

        int leftsum = 0;
        int maxsum = 0;
        int rightsum = 0;

        int length = arr.length - 1;

        // Take first k elements from left
        for (int i = 0; i < k; i++) {
            leftsum += arr[i];
        }

        maxsum = leftsum;

        // Remove from left and add from right
        for (int i = k - 1; i >= 0; i--) {

            leftsum -= arr[i];
            rightsum += arr[length];

            maxsum = Math.max(maxsum, leftsum + rightsum);

            length--;
        }

        return maxsum;
    }

    public static void main(String[] args) {

        int arr[] = {6, 2, 3, 4, 7, 2, 1, 7, 1};
        int k = 4;

        int result = MaxPoint(arr, k);

        System.out.println("Maximum Points = " + result);
    }
}
