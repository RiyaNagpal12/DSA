// GRID PROBLEM 
public class ques33{
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
