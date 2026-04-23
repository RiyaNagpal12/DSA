/**
 * Problem: Rat in a Maze (Backtracking)
 *
 * Given an N x N maze represented as a 2D matrix:
 * - 1 indicates an open cell (path available)
 * - 0 indicates a blocked cell (cannot be traversed)
 *
 * A rat starts from the top-left corner (0,0) and needs to reach
 * the bottom-right corner (N-1, N-1).
 *
 * The rat can move only in two directions:
 * - Right (→)
 * - Down (↓)
 *
 * The goal is to find a valid path from source to destination.
 * If a path exists, print the path using a solution matrix where:
 * - 1 represents the path taken
 * - 0 represents unused cells
 *
 * If no path exists, return false or print an appropriate message.
 *
 * Approach:
 * This problem is solved using Backtracking.
 * We explore all possible paths recursively and backtrack
 * when a path leads to a dead end.
 */
public class SolveMaze  {

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
