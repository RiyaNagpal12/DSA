/*
Problem: Bubble Sort
Topic: Sorting Algorithms

Approach:
- Repeatedly compare adjacent elements
- Swap if they are in the wrong order
- After each pass, the largest element moves to the end

Time Complexity:
- Worst Case: O(n^2)
- Best Case: O(n) (with optimization)

Space Complexity: O(1)
*/
public class bubblesort{
  public static void bubblesort(int arr[]){
        for(int i=0;i<arr.length -1 ;i++){
          for(int j =0 ;j<arr.length -1-i;j++){
            if(arr[j]>arr[j+1]){
              // swap
              int temp = arr[j];
              arr[j]=arr[j+1];
              arr[j+1]=temp;}}}
  }
  public static void main(String[] args){
      int arr[] = {5, 3, 8, 2, 1};

        bubblesort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
    
  
