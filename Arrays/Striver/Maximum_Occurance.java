public class Max_Occurance{
  public static int result (int arr[]){
    int count =1 ;
    int result = arr[0];
    for(int i=1 ;i<arr.length ;i++){
   
        if(count <= 0 ){
        result = arr[i];
          count=1;
        }
        if(arr[i] == result ){
        count++;}
          
        else{
        count --;
      }
    }
    return result;

  }
  
          
    
