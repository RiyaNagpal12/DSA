/*“Write a Java program using backtracking to:

Fill an array with increasing values starting from 1

Print the array when completely filled

Then modify the array during backtracking by reducing each element by 2

Finally print the modified array
*/public class ReducingElement { 

    public static void change(int arr[] , int i , int val){
        if ( i == arr.length){
            printarr(arr);
            
            return;
        }
        arr[i]= val; 
        change(arr, i+1, val+1); // increase filling 
        arr[i]= arr[i]-2; // Backtracking to decrease element by 2
    }

    public static void printarr(int arr[]){
        for (int i = 0; i < arr.length;i ++) {
          System.out.print(arr[i]+" ");}}
            
       
   
    public static void main(String[] args) {
        
        int arr[] = new int[5];
        change(arr ,0,1);
        printarr(arr);
    }


}
