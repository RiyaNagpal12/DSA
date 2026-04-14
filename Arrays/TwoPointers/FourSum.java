/*
Problem: 4Sum (LeetCode #18)
Topic: Arrays, Two Pointers

Approach:
- Sort the array
- Fix two elements (i, j) using nested loops
- Use two pointers (low, high) to find the remaining two numbers
- Skip duplicates to avoid repeated quadruplets

Time Complexity: O(n^3)
Space Complexity: O(1) (excluding output)

Key Points:
- Extension of 3Sum problem
- Sorting is required for two-pointer approach
- Handle duplicates at i, j, low, and high
- Efficient compared to brute force O(n^4)

Example:
Input: [1, 0, -1, 0, -2, 2], target = 0
Output:
-2 -1 1 2
-2 0 0 2
-1 0 0 1
*/
import java.util.Arrays;
public class FourSum{
  public static void foursum(int arr[] , int target){
    Arrays.sort(arr);
    for(int i=0;i<arr.length -3 ;i++){
      if(i>0 && arr[i]==arr[i-1]){
        continue;}
      for(int j=i+1 ;j<arr.length -2 ;j++){
        if(j>i+1&& arr[j]==arr[j-1]){
          continue;}
        int low = j+1;
        int high = arr.length-1;

      while(low<high){
        int sum = arr[i]+arr[j]+arr[low]+arr[high];
        if(sum == target){
          System.out.println(arr[i]+" " +arr[j]+" " +arr[low]+" " +arr[high]);
          while(low<high && arr[low] ==arr[low+1]){
            low++;
          }
          while(low<high && arr[high]==arr[high-1]){
            high--;}

          low++;
          high--;
        }
          
        else if(sum <target){
          low++;}
        else{
          high --; 
        }
      }
      }
    }
  }
     public static void main(String[] args) {
        int arr[] = {1, 0, -1, 0, -2, 2};
        int target = 0;

        fourSum(arr, target);
    }
}
