public class Lower_Bound {

    public static int lower_bound(int arr[], int start, int end, int k) {

        int ans = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] <= k) {
                ans = mid;
                start = mid + 1;
            }

            else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 8, 10, 11, 12, 19};

        System.out.println(lower_bound(arr, 0, arr.length - 1, 5));
    }
}
