public class subarray {
  // Longest Subarray of length k 
  public static int longest_subarray(int arr[] , int k){
    int start =0;
    int ans =0;
    int sum =0;
    
    for(int end =0 ;end<arr.length ;end++){
      sum +=arr[end];

      while (sum>k && start <= end){
        sum -=arr[start];
        start++;
      }
      if(sum == k){
        ans = Math.max(ans , end-start+1);
      }
    }
    return ans ; }
  
      
