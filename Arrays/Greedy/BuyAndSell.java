/*
 * Find the maximum profit by buying and selling once.
 *
 * Approach: Greedy
 * - Track minimum price so far
 * - Calculate profit at each step
 * - Update max profit
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

import java.util.*;
public class BuyAndSell {
  public static int buyandsell(int arr[]){
     int buyprice = Integer.MAX_VALUE;
      int maxprofit=0;

    for (int i =0 ;i <arr.length ;i++){
      if(buyprice<arr[i]){
        int profit = arr[i] -buyprice;
        maxprofit = Math.max(profit , maxprofit);
      }
      else{
        buyprice = arr[i];
      }
    }
    
      return maxprofit ;
    }

  public static void main(String[] args){
    
    int arr[] = {7, 1, 5, 3, 6, 4};

    int result = buyandsell(arr);

    System.out.println("Maximum Profit: " + result);
  }
}
    

  
