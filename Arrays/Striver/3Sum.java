//3 Sum Problem 
import java.util.Arrays;

public class Three_sum {

    public static void threesum(int arr[], int target) {

        Arrays.sort(arr);

        int n = arr.length;

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate elements
            if (i > 0 && arr[i] == arr[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    System.out.println(arr[i] + " "
                            + arr[left] + " "
                            + arr[right]);

                    left++;
                    right--;

                    // Skip duplicate left elements
                    while (left < right &&
                           arr[left] == arr[left - 1]) {
                        left++;
                    }

                    // Skip duplicate right elements
                    while (left < right &&
                           arr[right] == arr[right + 1]) {
                        right--;
                    }
                }

                else if (sum < target) {
                    left++;
                }

                else {
                    right--;
                }
            }
        }
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, -1, 0, -1, 2, 3};
        int target = 3;

        threesum(arr, target);
    }
}
          
