public class FindTranspose  {

    public static void transpose(int arr[][]){
        int rows = arr.length;
        int cols= arr[0].length;

        for (int i=0;i<rows ;i++){
            for(int j =0;j<cols ;j++){
                System.out.print(arr[j][i]+ " ");
            }
            
            System.out.println("");

        }

      
    }
    
    public static void print(int arr[][]){
        for(int i =0 ;i<arr.length ;i++){
            for(int j=0;j< arr[0].length ;j++){
                System.out.print(arr[i][j] +" ");

            }

            System.out.println("  ");
        }
    }
    public static void main(String[] args) {
        int arr[][] ={{ 1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Origional Matrix");
        print(arr);
        System.out.println("Transposed Matrix");
        transpose(arr);
    }
}
