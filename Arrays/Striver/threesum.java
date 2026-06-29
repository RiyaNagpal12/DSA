import java.util.*;
public class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> result = new HashSet<>();
        for(int i =0;i<nums.length-2;i++){
            Hashmap<Integer , Integer > map = new Hashmap<>();
           
            for (int j=i+1 ;j<nums.length ;j++){
                
                int complement = 0 - nums[i]-nums[j];
                if (map.containsKey(complement)){
                    
                    List<Integer> temp = new ArrayList<>();

                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(complement);

                    Collections.sort(temp);

                    ans.add(temp);
                }

                map.put(nums[j],j );
            }
        }

      return new ArrayList<>(ans);
    }

    public static void main(String[] args){
       int nums[] = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
