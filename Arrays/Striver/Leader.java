public class Leader {
  public static void leader(int arr[] ){
    int max = arr[arr.length-1];
    System.out.print(max + " ");
    for(int j= arr.length -2 ;j>=0 ; j--){
      if (arr[j]> max){
        max = arr[j] ;
        System.out.print( max +" " );
      }
    }
  }

  public static void main(String[] args){
    int arr[] ={16,17,4,3,5,2};
    leader(arr);
}
}
