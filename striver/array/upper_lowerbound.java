public class solution{
  public static int lowerbound(int arr[] , int target){
    int low= 0;
    int high = arr.length-1;
    int ans = arr.length;
    int mid = low + (high - low) / 2;
    while(low<=high){
      if(arr[mid]>=target){
        ans = mid;
        high =mid-1;
      }
      else{
        low=mid+1;
      }
    }
    return ans ;
  }
public static int upperbound(int arr[] , int target){
  int low=0;
  int high = arr.length-1;
  int ans = arr.length;
  int mid = low + (high - low) / 2;
  while(low<=high){
    if(arr[mid]>target){
      ans = mid;
      high=mid-1;
    }

    else{
      low=mid+1;
    }
  }
  return ans; }

    
