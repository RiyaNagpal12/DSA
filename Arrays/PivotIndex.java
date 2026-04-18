public class PivotIndex {
  public static int pivotindex(int arr[] , int start , int end ){
    int i= start-1 ;
    int pivot = arr[end];
    for(int j= start ; j<end ;j++){
      if(arr[j]< pivot){
        i++;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]=temp;}
    }

    int temp = arr[end];
    arr[end] = arr[i+1 ];
    arr[i+1 ]= temp;
    return i+1 ;
    
  }  

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};

        int pIndex = pivotIndex(arr, 0, arr.length - 1);

        System.out.println("Pivot Index: " + pIndex);

        System.out.print("Array after partition: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
  
