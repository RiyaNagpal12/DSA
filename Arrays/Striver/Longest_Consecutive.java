// Longest Consecutive Subarray

public  class Longest_Consecutive{
  public static int count(int arr[]){
    Arrays.sort(arr);
    int count =0;
    int maxcount =0;
    for(int i=1  ; i<arr.length ;i++){
      if (arr[i] == arr[i - 1]) {
                continue;
            }
      if(arr[i] == arr[i-1] +1){
        count++;
        maxcount = Math.max(count , maxcount);
      }
      else{
        count=0;
      }

    }
    return maxcount ;
  }
  
