/*
 * Problem: Spiral Matrix Traversal
 * --------------------------------
 * Print all elements of a 2D matrix in spiral order.
 *
 * Approach: Boundary Traversal (Layer by Layer)
 * ---------------------------------------------
 * - Use four pointers:
 *      start_row, end_row, start_col, end_col
 *
 * - Traverse in 4 steps:
 *      1. Left → Right   (Top row)
 *      2. Top → Bottom   (Right column)
 *      3. Right → Left   (Bottom row)
 *      4. Bottom → Top   (Left column)
 *
 * - After completing one layer, shrink boundaries:
 *      start_row++
 *      start_col++
 *      end_row--
 *      end_col--
 *
 * - Continue until all layers are traversed.
 *
 * Time Complexity: O(n * m)
 * Space Complexity: O(1)
 *
 * Example:
 * Input:
 * 1  2  3  4
 * 5  6  7  8
 * 9 10 11 12
 *
 * Output:
 * 1 2 3 4 8 12 11 10 9 5 6 7
 *
 * Category: Arrays (2D Matrix Traversal)
 */
🚀 Extra Tip for GitHub

Add this as filename:

SpiralMatrixTraversal.java

If you want next:
🔥 I can give Rotate Matrix (very important)
🔥 Or help you build a complete DSA GitHub repo structure (placement ready)
public class SpiralArray{
  public static void spiralarray(int arr[][]){
    int start_row =0;
    int start_col =0;
    int end_row = arr.length -1 ;
    int end_col = arr[0].length -1;
    while (start_col <= end_col && start_row <= end_row) {

    for(int i = start_col ;i<=end_col ;i++){
      System.out.print(arr[start_row][i] + " ");
    }

    for(int j=start_row+1 ; j<=end_row ;j++){
      System.out.print(arr[j][end_col] + " ");
    }
    if(start_row < end_row){
      for(int i = end_col -1 ; ;i>=start_col ; i--){
        System.out.print(arr[end_row][i] + " ");
     }
    }
    if(start_col< end_col){
      
      for(int j = end_row -1 ; j>=start_row+1 ; j--){
        System.out.print(arr[j][start_col] + " ");
      }
    }

  start_row ++;
  start_col ++;
  end_row --;
  end_col--;
    }
    
  }

  public static void main(String[] args) {

    int arr[][] = {
      {1, 2, 3, 4},
      {5, 6, 7, 8},
      {9, 10, 11, 12}
    };

    spiralarray(arr);
  }
}
  
