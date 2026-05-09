public class Two_Sum{
  public static void twosum(int arr[] ,int k){
    int i=0;
    int j = arr.length-1;
    while(i<j){
      int sum = arr[i] + arr[j];
      if(sum ==k){
        System.out.println( i +" " +j);
        return
      }

      if(sum < k){
        i++;
      }

      else {
        j--;
      }
    }
  }
  
      

    
