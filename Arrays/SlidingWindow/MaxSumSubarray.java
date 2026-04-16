

/*
 * Problem: Maximum Sum Subarray of Size K
 * ---------------------------------------
 * Find the maximum sum of any contiguous subarray of size k.
 *
 * Approach: Sliding Window (Fixed Size)
 * ---------------------------------------
 * - Compute sum of first k elements
 * - Slide window:
 *      add next element
 *      remove previous element
 * - Track maximum sum
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;
public class MaxSumSubarray{
  public static int  maxsumsubarray(int arr[] , int k){
    int sum =0;
    for(int i =0;i<k ;i++){
      sum += arr[i];
    }
    int max = sum ;
    for(int i=k;i<arr.length ;i++){
      sum+=arr[i];
      sum-=arr[i-k];
      max = Math.max(sum , max);
    }

    return max;
  }

  public static void main (String arr[]){
    
    int arr[] = {2, 1, 5, 1, 3, 2};
    int k = 3;

    int result = maxsumsubarray(arr, k);

    System.out.println("Maximum sum of subarray of size " + k + " is: " + result);
  }
}
    

  
