 /* * Problem: Maximum Subarray Sum (Kadane's Algorithm)
 * -------------------------------------------------
 * Find the contiguous subarray with the largest sum.
 *
 * Approach:
 * - Add elements to current sum
 * - Update max sum
 * - If current sum becomes negative → reset to 0
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
public class KadanesAlgo{
  public static int maxsum(int arr[]){
    int maxsum = Integer.MIN_VALUE;
    int currensum =0;
    for(int i =0 ;  i<arr.length ;i++){
      currentsum +=arr[i];
      maxsum = Math.max(currentsum , maxsum);
      if(currentsum<0){
        currentsum =0;
      }


    }
    return maxsum ;
  }
  public static void main(String[] args){
     int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

    System.out.println("Maximum Subarray Sum: " + maxSubarray(arr));
  }
}
