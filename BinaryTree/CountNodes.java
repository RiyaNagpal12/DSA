/*Implemented recursive DFS traversal to count total nodes in a binary tree
Handled base case for null nodes efficiently
Ensured O(n) time complexity by visiting each node once
Demonstrates strong understanding of tree recursion*/

public class CountNodes {
  public static class Node{
    int data ;
    Node left ;
    Node right ; 
  public Node (int data){
    this.data = data ;
    left = null;
    right =null;}

  }

public static int CountNode (Node root ){
  if(root == null){
    return 0;
  }
  int leftcount = CountNode (root.left );
  int rightcount = CountNode(root.right);
  return leftcount + rightcount+1 ; 

}
  public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    System.out.println("Total Nodes: " + CountNode(root));
  }
}
    
