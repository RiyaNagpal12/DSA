/*✔ Problem: Find sum of all nodes in a binary tree

✔ Approach:
- Used recursion (post-order traversal)
- Calculated sum of left subtree
- Calculated sum of right subtree
- Added root node value

✔ Complexity:
- Time: O(n)
- Space: O(h) (height of tree)

✔ Key Concept:
Tree traversal using recursion*/
public class Sum {
  public static class  Node {
    int data ;
    Node left ;
    Node right ;

    public Node (int data ){
      this.data = data;
      left = null;
      right = null;
  }
  }


    public static int sum (Node root  ){

      if(root == null){
        return 0 ;}

      int leftsum = sum(root.left );
      int rightsum = sum(root.right);
      return leftsum + rightsum + root.data ;

    }


    public static void main(String[] args){
        Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    System.out.println("Sum of tree : " +sum(root));
  }
}
      
      


    
  
     
