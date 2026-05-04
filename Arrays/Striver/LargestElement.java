// find the largest element from the array
public class LargestElement{

  public static int largestelement (int arr[]){
    int largestelement = Integer.MIN_VALUE;
    
    for(int i =0 ;i<arr.length ;i++){
      if(arr[i]>largestelement){
        largestelement = arr[i];
      }
    }

      return largestelement ;}
    
  public static void main (String[] args){
    int[] arr = {10, 25, 5, 40, 15};
    System.out.println(largestelement(arr));
    return 0;
  }
