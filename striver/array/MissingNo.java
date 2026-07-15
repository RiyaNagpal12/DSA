public class MissingNo{
  public static int Missing(int nums[]){
    for(int i =1;i<nums.length;i++){
      if(nums[i]!=nums[i-1]+1){
        return nums[i-1]+1;
      }
    }
    return -1;
  }
}

    
