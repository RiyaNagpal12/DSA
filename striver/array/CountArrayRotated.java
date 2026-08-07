public class count{
  public static int count(int arr[]){
    int low =0;
    int high = arr.length-1;
    int index = -1;
    int ans = Integer.MAX_VALUE;
    while(low<=high){
      int mid = (low+high)/2;
      //left sorted
      if(arr[low]<=arr[high]){
        if (arr[low]<ans){
          
          index= low;
          ans = Math.min(ans , arr[low]);}
          break;
      }
      if(arr[low] <=arr[mid]){
        if(arr[low]<ans){
          ans = arr[low];
          index=low;}
        low=mid+1;
      }
      else{
        if(arr[mid]<ans){
          index=mid ;
        ans = arr[mid];}
        
        high=mid-1;
      }
  }
      return index;
  }
  
        
        
        
      
    
