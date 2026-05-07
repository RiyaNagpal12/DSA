public class Spiral {
  public static void spiral(int arr[][]){
    int start_row =0;
    int start_col =0 ;
    int end_row = arr.length-1 ;
    int end_col = arr[0].length-1 ;

  while(start_row <=end_row && start_col <= end_col){
    for(int i= start_col ; i<=end_col ;i++){
      System.out.print(arr[start_row][i] + " ");
    }
    for(int j = start_row +1 ; j<=end_row ;j++){
      System.out.print(arr[j][end_col]+ " ");
    }
   
    for(int i = end_col-1 ; i>= start_col;i--){
     
      if(start_row == end_row){
        break;}
       System.out.print(arr[end_row][i] +" " );
      
    }
    for(int j =end_row-1 ; j>= start_row +1 ; j--){
           if(start_col == end_col){
        break;}
      System.out.print(arr[j][start_col]+" ");
    }
    start_row++;
    end_row --;
    start_col++;
    end_col -- ;
  }
  }
