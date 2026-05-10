
// find missing element from 0 to n 
import java.util.*;
public class FindMissing{ 
  public static int find(int arr[]){
    Arrays.sort(arr);
    int result =0; 
    for (int i=1;i<arr.length ;i++){
      if (arr[i]!=arr[i-1]+1){
        result =arr[i-1]+1;
        break;
      }
    } 
    return result; 
  }
        
        
