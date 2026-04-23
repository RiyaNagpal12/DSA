public class ques36 {

    public static boolean issafe(int maze[][] , int row , int col){
        return (row >= 0 && col >= 0 &&
                row < maze.length && col < maze.length &&
                maze[row][col] == 1);
    }

    public static boolean solve(int maze[][]){
        int sol[][] = new int[maze.length][maze.length];

        if(solvemaze(maze, 0, 0, sol)) {
            print(sol);
            return true;
        }
        return false;
    }

    public static void print(int sol[][]){
        for(int i =0 ;i< sol.length; i++){
            for (int j= 0; j < sol.length; j++) {
                System.out.print(sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean solvemaze(int maze[][] , int row, int col , int sol[][]){

        // Destination
        if(row == maze.length - 1 && col == maze.length - 1){
            sol[row][col] = 1;
            return true;
        }

        if(issafe(maze , row , col)){

            if(sol[row][col] == 1){
                return false;
            }

            sol[row][col] = 1;

            if(solvemaze(maze, row+1, col, sol)){
                return true;
            }

            if (solvemaze(maze, row, col+1, sol)){
                return true;
            }

            sol[row][col] = 0; // backtrack
        }

        return false;
    }

    public static void main(String[] args) {
        int maze[][] = {
            {1,0,0,0},
            {1,1,0,1},
            {0,1,0,0},
            {1,1,1,1}
        };

        solve(maze);
    }
}
