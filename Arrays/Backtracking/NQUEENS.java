/*
Problem: N-Queens Problem (Backtracking)

Description:
The N-Queens problem involves placing N queens on an N×N chessboard such that 
no two queens attack each other. A queen can attack horizontally, vertically, 
and diagonally.

Approach:
- Use Backtracking to try placing a queen row by row.
- For each position, check if it is safe using the issafe() function:
  1. Check vertical column (above rows)
  2. Check left diagonal
  3. Check right diagonal
- If safe, place the queen and move to the next row.
- If not safe, try the next column.
- Backtrack by removing the queen and exploring other possibilities.

Output:
- Prints all possible valid board configurations.
- Displays the total number of ways to place N queens.

Time Complexity:
O(N!) due to recursive backtracking.

Example:
For N = 4, total solutions = 2.

Concepts Used:
- Recursion
- Backtracking
- 2D Arrays
*/
public class ques31 {
    public static boolean issafe(char board[][] , int row , int col){

        // vertical 
        for(int i = row -1  ; i>=0 ; i--){
            if(board[i][col]== 'Q'){
                return false;
            }

        }
        // left diagnol 
        for(int i = row-1,  j = col-1 ; i>=0 && j>=0 ;i--,j--){
            if(board[i][j]== 'Q'){
                return false ;
            }


        }
        
        // right 
        for(int i = row-1 ,j= col+1 ; i>=0 && j<board[0].length ; i-- , j++){
            if(board[i][j]=='Q'){
                return false;
            }

        }
        return true ;
         
    }
    public static void nqueens(char board[][] , int row){
        
        if(row== board.length){
            printboard(board);
            count ++;
            return ;
        }

        
        for(int j =0 ;j<board.length; j++){

            if(issafe(board , row , j) == true){
                board[row][j] = 'Q';
                nqueens(board, row+1);
                board[row][j]='x';

                }
       
        }
        


    }
    static int count = 0;

    public static void printboard(char  board[][]){
        System.out.println("Chess board");
        for(int i=0;i<board.length;i++){
            for(int j =0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
       public static void main(String[] args) {
           int n =4 ;
           char board[][] = new char[n][n];
            // intialise with 0 queens 

            for (int i = 0; i < n; i++) {
                for(int j =0;j<n ;j++){
                   board[i][j]='x';

                }

                
            }
            
                nqueens(board ,0);
                System.out.println("Total ways to place queen is:" +  count);
       }
    
}
