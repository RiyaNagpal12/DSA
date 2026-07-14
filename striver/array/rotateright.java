public class rotateright {

    public static void rotateright_k(int arr[], int d) {

        int n = arr.length;

        d = d % n;

        // reverse complete array
        reverse(arr, 0, n-1);

        // reverse first d elements
        reverse(arr, 0, d-1);

        // reverse remaining elements
        reverse(arr, d, n-1);
    }


    public static void reverse(int arr[], int start, int end) {

        while(start <= end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
