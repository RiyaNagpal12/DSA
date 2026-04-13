
/*
Problem: Insertion Sort
Topic: Sorting Algorithms

Approach:
- Start from index 1
- Pick current element (key)
- Shift all larger elements to the right
- Insert key at correct position

Time Complexity:
- Best Case: O(n)
- Worst Case: O(n^2)

Space Complexity: O(1)
*/

public class InsertionSort{
  public static void sort(int arr[]){
    for (int i=1 ;i<arr.length ;i++){
      int key = arr[i];
      int j=i-1;
      while(j>=0 && arr[j]>key){
        arr[j+1]=arr[j];
        j--;}
      arr[j+1]=key;}
  }
}
public static void main(String [] args){
  
    public static void main(String[] args) {
        int arr[] = {5, 3, 8, 2, 1};

        sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
  
  
