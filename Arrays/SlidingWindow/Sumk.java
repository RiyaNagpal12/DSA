public class longestsumabrrayk{ 
public static int sum(int arr[], int k){
  int right = 0; 
  int left =0;
  int maxlength =0; 
  int sum =0;
  while (right < arr.length ){
    sum += arr[right ];
    while (sum >k){
      sum -= arr[left];
      left ++;
    } 
    if (sum <=k){
      int length = right -left +1; 
      maxlength = Math.max(length , maxlength); 
    } 
    right ++; 
  } 
  return maxlength ;} 
  
