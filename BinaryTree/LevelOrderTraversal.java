/*Implemented Level Order Traversal (BFS) of a Binary Tree in Java using Queue, 
printing nodes level by level with recursion-based tree construction.*/
import java.util.*;
public class LevelOrderTraversal{
  public static class Node {
    int data ;
    Node left ;
    Node right ;

  public Node(int data){
    this.data = data ;
    left =  null;
    right =null ;
  }
  }
  
    public static class binarytree{
        static int index=-1;
        public static Node createtree(int nodes[]){
            index++;

            if(nodes[index]==-1){
                return null;

            }

            Node newnode = new Node(nodes[index]);
            newnode.left=createtree(nodes);
            newnode.right=createtree(nodes);

            return newnode;
        }
      public static void Levelorder(Node root ){
          Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
          Node current = q.remove();
          if(current ==null){
            System.out.println("");
          
          if(q.isEmpty()){

            break;
          }
          else{
            q.add(null);
          }
          }

         else {
           System.out.print(current.data + " ");
            if(current.left !=null){
            q.add(current.left);
          }
          if(current.right!=null){
            q.add(current.right);

          }
          



        }
      }
    }
}

  public static void main(String[] args) {
    int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

    binaryTree tree = new binaryTree();
    Node root = tree.createtree(nodes);

    tree.LevelOrder(root);
}
}
  
