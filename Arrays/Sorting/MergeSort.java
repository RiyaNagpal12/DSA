/*
Problem: Merge Sort
Topic: Divide and Conquer

Approach:
- Divide array into two halves
- Recursively sort both halves
- Merge the sorted halves

Time Complexity: O(n log n)
Space Complexity: O(n)
*/
public class MergeSort{
  public static void mergesort(int arr[] , int start , int end ){
    if(start>=end){
      return ;}
    int mid = (start +end)/2;
    mergesort(arr , start , mid);// left sort
    mergesort(arr , mid+1 ,end); // right sort 
    merge(arr , start , mid , end);
  }

  public static void merge(int arr[] , int start , int mid , int end){
    int temp[]= new int[end-start+1];
    int i= start;
    int j = mid+1;
    int k =0;
    while(i<=mid && j<=end){
      if(arr[i]<=arr[j]){
        temp[k]=arr[i];
        i++;
        k++;}
      else{
        temp[k]=arr[j];
        k++;
        j++;}}

      while(i<=mid){
        temp[k++]=arr[i++];
      }
    while(j<=end){
     temp[k++]=arr[j++];}

    for(int p=0 ; p<temp.length ;p++){
      arr[start+p]=temp[p];}
  }


   public static void main(String[] args) {
    int arr[] = {5, 3, 8, 4, 2};

    mergesort(arr, 0, arr.length - 1);

    for (int x : arr) {
      System.out.print(x + " ");
    }
  }
}
    
    
