public class longestsubstringsumk{
  public static int longestsubstring(int nums[] , int k ){
    int left=0;
    int right =0;
    int sum=0;
    int maxlength = Integer.MIN_VALUE;
    while(right<nums.length){
      sum += nums[right];
      while(sum > k){
        sum-=nums[left];
        left++;
      }
      if(sum==k){
        minlength= Math.max(maxlength , right-left+1);
      }
      right++;
    }

    return maxlength;
  }
}

    
