public class Maxsubarray{
  public static int maxsubarraysum(int nums[]){
    int currentsum =0;
    int maxsum =Integer.MIN_VALUE;
    for(int i =0;i<nums.length ;i++){
      currentsum += nums[i];
      if(currentsum < 0){
        currentsum = 0;
      }
      maxsum = Math.max(maxsum, currentsum);

    }
    return maxsum;
  }
}
