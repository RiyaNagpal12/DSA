/* Implemented a recursive solution to compute the height (maximum depth) of a binary tree using DFS traversal,
ensuring optimal time complexity.*/

import java.util.*;
public class Height {
  public static class Node {
    Node left ; 
    Node right ;
    int data ;

    public Node(int data){
      this.data= data ;
      left = null;
      right = null; 
    }

  }
  public static int height (Node root ){
    if(root ==null){
      return 0;
    }
    int leftheight = height(root.left);
    int rightheight = height(root.right);
    return Math.max(leftheight , rightheight )+1;
  }
  
    public static void main(String[] args) {
    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);
    root.left.left = new Node(4);
    root.left.right = new Node(5);

    System.out.println("Height of tree: " + height(root));
  }
}
    
