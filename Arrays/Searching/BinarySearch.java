/*
Problem: Binary Search (Recursive)
Topic: Searching

Approach:
- Divide the array into halves
- Compare key with middle element
- Search left or right accordingly

Time Complexity: O(log n)
Space Complexity: O(log n)
*/

public class BinarySearch{
  public static int  binarysearch(int arr[] , int key , int start , int end ){
    if(start >end){
      return -1 ;}

    int mid =(start+end)/2;
    if(arr[mid]== key){
      return mid;
    }
    else if(arr[mid]>key){
      return binarysearch(arr , key , start , mid-1);
    }
    else if (arr[mid] <key){
       return binarysearch(arr , key , mid+1 , end);
    }
  }
  public static void main(String [] args){
     int arr[] = {1, 2, 3, 4, 5, 8}; // MUST be sorted
        int key = 4;

        int result = binarySearch(arr, key, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
      
      
