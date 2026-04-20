/*- Optimized solution to calculate the sum of both diagonals in a square matrix
- Uses a single loop, reducing time complexity to O(n)
- Handles primary (i == j) and secondary (i + j == n - 1) diagonals efficiently
- Avoids double counting of the middle element in odd-sized matrices
- Improves over brute-force O(n^2) approach
- Clean, readable, and interview-friendly implementation*/

public class DiagnolSum {

    public static int diagonal_sum(int arr[][]){
        int sum = 0;
        int n = arr.length;

        for(int i = 0; i < n; i++){
            // primary diagonal
            sum += arr[i][i];

            // secondary diagonal 
            if(i != n - i - 1){
                sum += arr[i][n - i - 1];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{0,1,2},{3,4,5},{6,7,8}};
        int sum = diagonal_sum(arr);
        System.out.println("sum is :" + sum);
    }
}
