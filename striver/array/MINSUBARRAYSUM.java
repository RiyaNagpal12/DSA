public class MINSUBARRAYSUM{
  public static int minsubarray(int nums[] ){
    int currentsum =0;
    int minsum = Integer.MAX_VALUE;
    for(int i =0;i< nums.length ;i++){
      currentsum += nums[i];
      minsum = Math.min(currentsum , minsum);
      if(currentsum>0){
        currentsum = 0;}

    }
    return minsum;
  }
}
