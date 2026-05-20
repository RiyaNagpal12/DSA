public class Maxones{ 
public static in length(int arr[] , int k ){ 
  int left =0; 
  int right =0;
  int zeroes =0;
  int maxlength =0;
  while (right < arr.length (){ 
    if (arr[right]==0){
      zeroes++; 
    }
    if (zeroes > k ){
      if (arr[right ]==0){
        zeroes--;
        left ++;
      } 
    } 
    if (zeroes<=k){
      int length = right-left ++;
      maxlength = Math.max(length , maxlength );
      
    }
    right ++; 
  } 
  return maxlength ;} 
    
       
      
