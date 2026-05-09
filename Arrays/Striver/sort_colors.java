public class sortcolors{
  public staic void sort(int arr[]){
    int low =0;
    int mid =0;
    int end = arr.length-1;
    while(mid<=end){
      if(arr[mid]==0){
        int temp = arr[mid];
        arr[mid]=arr[low];
        arr[low]=temp;
        mid++;
        low++;
      }

      else if(arr[mid]==1){
        mid++;
      }
      else if(arr[mid]==2){
        int temp = arr[mid];
        arr[mid]=arr[end];
        arr[end]=temp;

        end--;
      }
    }
    
      
