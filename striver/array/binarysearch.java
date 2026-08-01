public class binarysearch{
  public static int search(int arr[] , int low , int high , int target){
    if(low>high){
      return -1 ;}
    int mid = (low +high)/2;
    if(target > arr[mid]){
      return search(arr , mid+1 , high, target);
    }
    else if (target <arr[mid]){
      return search(arr , low , mid -1 , target);}
    else if (target == arr[mid]){
      return mid ;
    }
    else{
      return -1 ;
    }
  }
      
