/*
Problem: Selection Sort
Topic: Sorting Algorithms

Approach:
- Find the minimum element in the unsorted part
- Swap it with the current position
- Repeat for all elements

Time Complexity: O(n^2)
Space Complexity: O(1)
*/

public static class SelectionSort{
  public static void sort(int arr[]){
    for(int i=0;i< arr.length-1;i++){
      int min_index= i;
      for(int j=i+1 ; j<arr.length;j++){
        if(arr[j]<arr[min_index]){
          min_index=j;}
      }
      int temp = arr[i];
      arr[i]= arr[min_index];
      arr[min_index]=temp;}}
  public static void main(String []  args){
     int arr[] = {64, 25, 12, 22, 11};

        sort(arr);

        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
