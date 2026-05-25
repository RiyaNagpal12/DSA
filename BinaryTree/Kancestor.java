/*This program finds the k-th ancestor of a given node in a binary tree using recursion.

Approach:
- Traverse the tree to locate the target node.
- Return distance (level) from the target node while backtracking.
- When the distance becomes equal to k, print the ancestor node.

Key Idea:
The function returns -1 if the node is not found, otherwise returns the distance from the target node.

Time Complexity: O(n)
Space Complexity: O(h) (recursion stack)*/


public class kancestor {
    
public static  class node{
        int data;
        node left;
        node right;

        public node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    public static int kancestor(node root , int k , int n1){
        if(root==null){
            return -1;
        }

        if(root.data==n1){
            return 0;
        }

        int left= kancestor(root.left, k, n1);
        int right =kancestor(root.right, k, n1);
        if(left==-1&&right==-1){
            return -1;
        }
        int max = Math.max(left, right)+1;
        if(max==k){
            System.out.println( root.data);
            
        }
        return max;

    }

    public static void main(String[] args) {
        node root = new node(1);
        root.left=new node(2);
        root.right=new node(3);
        root.left.left=new node(4);
        root.left.right=new node(5);
        root.right.left=new node(6);
        root.right.right=new node(7);
        int n =5 ;
        int k=2;
       kancestor(root, k, n);
    }
}
