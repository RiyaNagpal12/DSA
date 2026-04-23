
/* Problem Statement

Determine the winner of a 3×3 Tic Tac Toe game board.

 Approach
Traverse the board and check all possible winning conditions:
Rows (3 possibilities)
Columns (3 possibilities)
Diagonals (2 possibilities)
A player wins if all three positions in any row, column, or diagonal contain the same symbol ('X' or 'O') and are not empty ('-'). */

public class TicTacToe {

    public static char winner(char board[][]) {

        // Check rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] != '-' &&
                board[i][0] == board[i][1] &&
                board[i][1] == board[i][2]) {
                return board[i][0];
            }
        }

        // Check columns
        for (int i = 0; i < board[0].length; i++) {
            if (board[0][i] != '-' &&
                board[0][i] == board[1][i] &&
                board[1][i] == board[2][i]) {
                return board[0][i];
            }
        }

        // Main diagonal
        if (board[0][0] != '-' &&
            board[0][0] == board[1][1] &&
            board[1][1] == board[2][2]) {
            return board[0][0];
        }

        // Anti-diagonal
        if (board[0][2] != '-' &&
            board[0][2] == board[1][1] &&
            board[1][1] == board[2][0]) {
            return board[0][2];
        }

        return '-'; // No winner
    }
}
