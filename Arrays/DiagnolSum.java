public class ques23 {

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
