public class Sum {
  public static class  node {
    int data ;
    node left ;
    node right ;

    public node (int data ){
      this.data = data;
      left = null;
      right = null;
  }


    public static int sum (node root  ){

      if(root == null){
        return 0 ;}

      int leftsum = sum(root.left );
      int rightsum = sum(root.right);
      return leftsum + rightsum + root.data ;

    }


    public static void main(String[] args){
      
      


    
  
     
