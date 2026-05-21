// remove duplicatea 
public class Duplicate {

    public static int find(int arr[]) {
        int k = 0;  // pointer for unique elements

        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[k]) {
                k++;
                arr[k] = arr[j];   // overwrite
            }
        }

        return k + 1;  // new length of unique elements
    }

    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 3, 4, 4};

        int newLength = find(arr);

        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
        
