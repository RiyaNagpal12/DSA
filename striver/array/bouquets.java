public class Solution {
  public static boolean possible(int arr[] , int day , int m , int k ){
    int n = arr.length;
    int count =0;
    int no =0;
    for(int i =0;i<n ;i++){
      if(arr[i]<=day){
        count++;
      }
      else {
        no += count /k;
        count =0;
      }
    }
    no +=  count/k;
    if(no>=m){
      return true;
    }

  return false;
  }

public static int minday(int arr[] , int m , int k){
  if(m *k > arr.length){
    return -1;
  }
  
  int low = Integer.MAX_VALUE;
  int high = Integer.MIN_VALUE;
  for(int i= 0;i<arr.length;i++){
    low = Math.min(low , arr[i]);
    high = Math.max(high , arr[i]);
  }
  int ans =high;
  while(low<=high){
    int mid = (low+high)/2;
    if(possible(arr , mid , m , k)){
      ans = mid ;
      high=mid-1;
    }
    else{
      low=mid+1;
    } }
    return ans;
  }
}
