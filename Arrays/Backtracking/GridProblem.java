/*
Problem: Count Number of Paths in a Grid

Description:
Given an n x m grid, find the total number of ways to reach the bottom-right 
cell from the top-left cell. You can only move:
- Right (→)
- Down (↓)

Approach:
- Use Recursion to explore all possible paths.
- At each step:
  1. Move one step to the right (i, j+1)
  2. Move one step down (i+1, j)
- Base Cases:
  - If we reach the destination (n-1, m-1), return 1 (valid path found)
  - If we go out of bounds (i == n or j == m), return 0

Key Idea:
Total paths = paths from right + paths from down

Time Complexity:
O(2^(n+m))  → exponential (not optimized)

Space Complexity:
O(n+m) → recursion stack

Example:
For a 3x3 grid:
Total paths = 6

Concepts Used:
- Recursion
- Backtracking (implicit)
- Combinatorics (can be optimized using nCr)
*/
public class GridProblem{
    public static int gridcount(int i , int j , int n , int m){
        if ( i == n-1 && j == m-1){
            return 1;}

            else if( i == n || j == m ){
                return 0;
            }
            


            return gridcount(i+1 , j, n, m) + gridcount(i, j+1 , n ,m );
        }
    
        
        public static void main(String[] args) {
        int m =3  , n =3 ; 
        int grid[][] = new int[n][m];
        System.out.println(gridcount(0, 0 , n , m)) ;
}}
