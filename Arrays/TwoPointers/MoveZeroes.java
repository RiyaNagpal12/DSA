/*
Approach: Two Pointer Technique

- We use two pointers:
  i → keeps track of position for next non-zero element
  j → traverses the array

- If arr[j] is non-zero:
    → swap arr[i] and arr[j]
    → increment i

- This ensures:
    → all non-zero elements come to front
    → all zeroes move to end

Time Complexity: O(n)
Space Complexity: O(1) (in-place)

Stable solution (maintains relative order of non-zero elements)
*/
public static class MoveZeroes{
  public static void movezeroes(int arr[]){
    int i=0;
    for(int j = 0 ; j<arr.length ; j++){
      if(arr[j]!=0){
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]= temp ;
        i++;}

    }

  }

  public static void main(String[] args) {
        int arr[] = {0, 1, 0, 3, 12};

        movezeroes(arr);

        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
      
        
