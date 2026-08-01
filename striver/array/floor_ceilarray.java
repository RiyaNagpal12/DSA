public class solution{
  public static int floor(int arr[] , int x){
    int low=0;
    int high=arr.length-1;
    int ans=-1;
    while(low<=high){
      int mid = (low+high)/2;
      if(arr[mid] < = x){
        ans = mid ;
        low=mid+1
      }
      else{
       high=mid-1;
      }
      
    }
return ans;}
    public static int ceil (int arr[] , int x ){
        int low=0;
        int high=arr.length-1;
        int ans=-1;
        while(low<=high){
          int mid = (low+high)/2;
          if( arr[mid]>=x){
            ans=mid ;
            high = mid-1;
          }
          else{
            low = mid+1;
          }
        }
      return ans;
    }
  
      
