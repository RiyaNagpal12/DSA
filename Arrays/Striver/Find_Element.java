// Find the target Element 
public class FindElement{
  public static int findelement(int arr[]  , int start , int end , int target){
    while(start<end){
      int mid = (start+end)/2;
      if(arr[mid]==target){
        
        return mid ;}
      else if (arr[mid]<target){
        findelement(arr , mid+1 , end , target);
      }

      else if(arr[mid]>target){
        findelement(arr , start , mid-1 , target);

      }

        return -1

          }

  public static void main(String [] args){
    int arr[]= { 2 , 5 ,6, 7, 9, 11, 15,19);
    System.out.println(findelement(arr , 0 , arr.length -1 , 9));
  }
  }
  
    
