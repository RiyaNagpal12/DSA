public class Solution {

    public static int countInversion(int nums[], int low, int high) {
        return mergesort(nums, low, high);
    }

    public static int mergesort(int nums[], int low, int high) {

        if (low >= high) {
            return 0;
        }

        int count = 0;
        int mid = (low + high) / 2;

        count += mergesort(nums, low, mid);
        count += mergesort(nums, mid + 1, high);
        count += merge(nums, low, mid, high);

        return count;
    }

    public static int merge(int nums[], int low, int mid, int high) {

        int temp[] = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;
        int count = 0;

        while (i <= mid && j <= high) {

            if (nums[i] <= nums[j]) {
                temp[k++] = nums[i++];
            } else {
                count += (mid - i + 1);
                temp[k++] = nums[j++];
            }
        }

        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        while (j <= high) {
            temp[k++] = nums[j++];
        }

        for (int p = low; p <= high; p++) {
            nums[p] = temp[p - low];
        }

        return count;
    }
}
