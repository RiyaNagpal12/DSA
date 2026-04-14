/*
Problem: 3Sum (LeetCode #15)
Topic: Arrays, Two Pointers

Approach:
- Sort the array
- Fix one element (i)
- Use two pointers (left and right) to find remaining two elements
- Skip duplicates to avoid repeating triplets

Time Complexity: O(n^2)
Space Complexity: O(1) (excluding output)

Key Points:
- Works only after sorting
- Handle duplicates carefully
- Uses two pointer technique to reduce complexity

Example:
Input: [-1, 0, 1, 2, -1, -4]
Output:
-1 -1 2
-1 0 1
*/
import java.util.Arrays;
public class ThreeSum{
  public static void threesum(int arr[]){
    Arrays.sort(arr);
    for(int i=0 ;i<arr.length -2;i++){
      if(i>0 && arr[i]==arr[i-1]){
        continue;}
        int left =i+1;
        int right = arr.length-1;
        while(left<right){
          int sum = arr[i]+arr[left]+arr[right];
          if(sum ==0){
            System.out.println(arr[i]+ " "+arr[left] + " " + arr[right] );
           
          while(left <right && arr[left]==arr[left+1]){
            left++;}
          while(left<right && arr[right]==arr[right-1]){
            right--;}

            left++;
            right--;
          }
         else if(sum >0){
            right--;}
          else{
            left++;}
        }
    }
  }

  public static void main(String[] args){
         int arr[] = {-1, 0, 1, 2, -1, -4};
        threeSum(arr);
    }
}
  
      
            
