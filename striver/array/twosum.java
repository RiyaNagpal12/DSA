public class twosum{
  public static List<Integer> twosum(int nums[] , int k){
    int sum=0;
    ArrayList<Integer> ans= new ArrayList<>();
    int left= 0;
    int right = nums.length-1;
    while(left<right){
      sum = nums[left] + nums[right];
      if(sum>k){
        right--;
      }

      else if (sum <k){
        left++;
      }

      else if (sum== k){
        ans.add(left);
        ans.add(right)}
      left++;
      right--;}
  }
  
  return ans;
  }
}

        
          
        
    
