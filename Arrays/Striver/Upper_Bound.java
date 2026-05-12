public class Upper_Bound{
// Find upper bound 
  public static int upper_bond(int arr[] , int start , int end , int k){
    int ans = -1 
    while(start<=end){
      int mid = start+(end-start)/2;

      if(arr[mid]>= k){
        ans = mid ;
       end = mid-1;
      }
      else{
       end = mid-1;
      }
      
    }
    
