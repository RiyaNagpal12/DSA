// Set Matrix to 0
public class Set_Matrix {

    public static void set(int arr[][]) {

        boolean firstRow = false;
        boolean firstCol = false;

        int m = arr.length;
        int n = arr[0].length;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                firstRow = true;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstCol = true;
            }
        }

        // Mark rows and columns
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set rows to zero
        for (int i = 1; i < m; i++) {

            if (arr[i][0] == 0) {

                for (int j = 1; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set columns to zero
        for (int j = 1; j < n; j++) {

            if (arr[0][j] == 0) {

                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }

        // Set first row
        if (firstRow) {

            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Set first column
        if (firstCol) {

            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void print(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int arr[][] = {
                {1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}
        };

        set(arr);

        print(arr);
    }
}
      
      
