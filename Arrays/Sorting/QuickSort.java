/*
Problem: Quick Sort
Topic: Divide and Conquer

Approach:
- Choose a pivot (last element)
- Place pivot at correct position
- Recursively sort left and right parts

Time Complexity:
- Average: O(n log n)
- Worst: O(n^2)

Space Complexity: O(log n)
*/
public class QuickSort{
  public static void quicksort(int arr[] , int start , int end){
    if(start>=end){
      return ;}

    int pivotindex = partition(arr , start , end);
    quicksort(arr , start , pivotindex-1);
    quicksort(arr , pivotindex+1 , end);
  }

public static int partition(int arr[] , int start , int end){
  int pivot = arr[end];
  int i=start-1;
  for(int j =start ;j<end ;j++){
    if(arr[j]<pivot){
      i++;
      int temp =arr[i]; // swap i and j 
      arr[i]=arr[j];
      arr[j]=temp;}}
  // place pivot in right position ;
  int temp = arr[i+1];
  arr[i+1]=arr[end];
  arr[end]=temp ;
  return i+1;
}

public static void main (String [] args){
  int arr[] = {5, 3, 8, 4, 2};

    quicksort(arr, 0, arr.length - 1);

    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}
  
  
  
