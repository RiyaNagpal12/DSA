import java.util.*;

public class TwoSum {

    public static List<Integer> twoSum(int nums[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int target = k - nums[i];

            if (map.containsKey(target)) {
                ans.add(map.get(target));
                ans.add(i);
                return ans;
            }

            map.put(nums[i], i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums[] = {2, 7, 11, 15};

        System.out.println(twoSum(nums, 9));
    }
}
