import java.util.*;
public class LongestSubarray {
  public static int longestsubarray(int arr[]){
    Arrays.sort(arr);
    int longest =1;
    int count =1;
    if(arr.length == 0){
      return 0;}
for(int i =1 ;i<arr.length ;i++){
  if(arr[i] == arr[i-1]){
    continue ;
  }

  if(arr[i] == arr[i-1]+1){
    count ++;
  }

    else{
      count =1 ;
    }

  longest = Math.max(count , longest);}
  return longest ;
}

public static void main(String[] args) {
    int arr[] = {100, 4, 200, 1, 3, 2};

    int result = longestsubarray(arr);

    System.out.println("Longest consecutive sequence length = " + result);
}
