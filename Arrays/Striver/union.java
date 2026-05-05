public class UnionArray {

    public static void union(int arr1[], int arr2[]) {
        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            } 
            else if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } 
            else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }

        // Remaining elements of arr1
        while (i < arr1.length) {
            System.out.print(arr1[i] + " ");
            i++;
        }

        // Remaining elements of arr2
        while (j < arr2.length) {
            System.out.print(arr2[j] + " ");
            j++;
        }
    }

    public static void main(String[] args) {
        int arr1[] = {1, 2, 4, 5};
        int arr2[] = {2, 3, 5, 6};

        union(arr1, arr2);
    }
}
