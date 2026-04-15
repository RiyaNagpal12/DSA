/*
Problem: Remove Duplicates from Sorted Array

Approach:
- Use two pointers:
  1. Slow pointer (i) to track position of unique elements
  2. Fast pointer (j) to scan the array
- Compare arr[i] with arr[j]
- If different, increment i and update arr[i] = arr[j]

Key Idea:
- Since array is sorted, duplicates are adjacent

Time Complexity: O(n)
Space Complexity: O(1)

Returns:
- Length of array with unique elements (in-place modification)
*/
public class RemoveDuplicates{
  public static int removeduplicate(int arr[]){
    if(arr.length==0){
      return 0;}
    int i =0;
    for(int j =i+1 ; j<arr.length ;j++){
      if(arr[i]!=arr[j]){
        i++;
        arr[i]=arr[j]; }
    }
      return i+1;
    }


     public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3};

        int len = removeduplicate(arr);

        System.out.println("New length: " + len);
        for (int k = 0; k < len; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
        
        
      
