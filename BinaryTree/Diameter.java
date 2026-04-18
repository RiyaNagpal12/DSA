public class Diameter {
  public static class Node {
    int data ;
    Node left ;
    Node right ;


  public Node (int data ){
    this.data = data ;
    left = null;
    right = null;
  }
  }

  public static int height(Node root ){
    if(root ==null){
      return 0;}
    int leftheight = height(root.left);
    int rightheight =height(root.right);

    return Math.max(leftheight , rightheight )+1 ;
  }

  public static int diameter(Node root ){
    if(  root == null){
      return 0 ;}

    int leftd = diameter(root.left);
    int rightd = diameter(root.right);
    int selfd = height(root.left)+ height(root.right)+1;
    return Math.max(selfd , Math.max(rightd , leftd));
  }

  public static void main(String[] args){
    
    
      Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        System.out.println("Diameter of tree: " + diameter(root));
    }
}
