// find minimum sum subarray
public class MinSumSubarray{
  public static int minsum(int arr[]){
    int currentsum =0;
    int minsum=Integer.MAX_VALUE;
    for(int i=0; i<arr.length ;i++){
      currentsum += arr[i];
      minsum = Math.min(currentsum , minsum);

    if(currentsum >0){
      currentsum =0;}
    }
    return minsum ;}
  
