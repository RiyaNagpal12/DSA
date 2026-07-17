public class Solution {

    public static int element(int row, int col) {

        // Convert to 0-based indexing
        row--;
        col--;

        long ans = 1;

        for (int i = 1; i <= col; i++) {
            ans = ans * (row - i + 1);
            ans = ans / i;
        }

        return (int) ans;
    }

    public static void main(String[] args) {
        System.out.println(element(5, 3)); // Output: 6
    }
}
