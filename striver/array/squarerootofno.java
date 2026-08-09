public class squareroot{
 // using linear search 
  public static int squareroot(int n){
    int ans=0;
    for(int i =0;i<=n ;i++){
      if(i*i <= n ){
        ans = i ;
      }
      else {
        break;
      }
    }
    return ans }
}
// using binary search 
public static int square_root(int n){
  int ans =0;
  int low=1;
  int high= n;
while(low<=high){
  int mid = (low+high)/2;
  if(mid*=mid <= n ){
    ans = mid;
    low=mid+1;
  }
  else {
    high = mid-1;
  }
}

  return -1;
}

    
