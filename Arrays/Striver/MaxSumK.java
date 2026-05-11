// Maximum Subarray Sum of k length
public class MaxSum_k{
 public static int maxsum(int arr[] ,int k){
     if (k > arr.length){
       return -1; }
    int currentsum =0;
    
    for(int i=0;i<k ;i++){
      currentsum += arr[i];
    }
    int maxsum = currentsum ;
    for(int i =k ;i<arr.length ;i++){
      currentsum =  currentsum +arr[i] - arr[i-k];
      maxsum = Math.max(currentsum , maxsum );
    }
    return maxsum ;
  }
  
