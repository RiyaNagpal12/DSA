public class RepeatingMissing{
  public static int[] repeatingMissing( int grid[][]){
    int n = grid.length;
    int N = n*n;
    long expectedsum = (long) N * (N+1)/2;
    long expectedsquaresum = (long) N * (N + 1) * (2L * N + 1) / 6; 
    long actualsum =0;
    long actualsquaresum = 0;
    for(int i =0 ;i< n ;i++ ){
      for(int j =0; j<n ;j++){
        actualsum += grid[i][j];
        actualsquaresum += grid[i][j] * grid[i][j];
      }

    }
    long A = expectedsum - actualsum ;
    long B = (expectedsquaresum - actualsquaresum)/A;


  int repeating = (int) A+B /2;
    int missing = (int) repeating - A
      ;


  int arr[] = { repeating , missing};
    return arr;
    
