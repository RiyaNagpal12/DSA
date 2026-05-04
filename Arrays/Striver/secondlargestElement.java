// Find the second largest element from an array
public class secondlargest {

    public static int findsecondlargest(int arr[]) {
        int largest_Element = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest_Element) {
                second_largest = largest_Element;
                largest_Element = arr[i];
            } 
            else if (arr[i] > second_largest && arr[i] != largest_Element) {
                second_largest = arr[i];
            }
        }

        return second_largest;
    }
}
      
