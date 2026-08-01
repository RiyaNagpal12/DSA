public class lowerbounf{
  oublic static int indexlowerbound(int arr[]  , int n ){
    int low=0 ;
    int high = arr.length-1;
    int ans = 0;
    while(low<=high){
      int mid = (low+high)/2;
      if(arr[mid]>=n ){
        ans = arr[mid];
        high = mid-1;
      }

    else {
      low= mid+1;
      
    }

    }
    return ans ;
  }
  
