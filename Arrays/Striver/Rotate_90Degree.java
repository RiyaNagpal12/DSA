// Rotate the array by 90 degree 
// find transpose
// change first col with last 

public class Rotate{
  public static void rotate(int arr[][]){
    for(int i =0;i<arr.length;i++){
      for(int j=0;j<arr[0].length ;j++){
        arr[i][j]=arr[j][i];
      }
    }
    for(int i = 0 ; i< arr.length; i++){
      int start = 0;
      int end = arr.length-1 ;
      while(start<end){
           int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
    }

        
