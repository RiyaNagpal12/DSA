/*
Problem: Two Sum (Sorted Array)
//Leetcode Problem 167
Approach: Two Pointer

Time Complexity: O(n)
Space Complexity: O(1)
*/


public class TwoSum{
  public static void twosum(int arr[] , int target){
    int low=0;
    int high=arr.length-1;
    while(low<high){
      int sum = arr[low]+arr[high];
      if(sum == target){
        System.out.println(low+" " +high );
        return;}
      else if(sum <target){
        low++;}
      else{
        high--;}
    }
      public static void main(String[] args) {
        int arr[] = {2, 7, 11, 15}; // MUST be sorted
        int target = 9;

        twoSum(arr, target);
    
}
}
        
