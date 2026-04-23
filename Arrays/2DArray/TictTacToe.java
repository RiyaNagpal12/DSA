public class TicTacToe {
  public static char winner(char board[][]){
    // check rows ::
  for(int i =0;i<board.length;i++){
    if(board[i][0] != '-' && board[i][1]==board[i][0] && board[i][2]==board[i][1]){
      return board[i][0];
    }
  
  }
    // for columns 
    for (int i=0;i<board[0].length ;i++){
      if(board[0][i] !='-' && board[0j][i] ==board[1][i] && board[1][i] == board[2][i] ){
        return board[0][i];
      }

    }

  // for diagnol 
  for 
