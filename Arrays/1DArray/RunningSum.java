public class RunningSum {
    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};

        int[] result = runningSum(arr);

        System.out.print("Running Sum: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
