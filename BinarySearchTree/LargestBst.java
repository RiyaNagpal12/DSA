/*/*
🔹 Problem:
Find the size of the largest BST (Binary Search Tree) present in a given binary tree.

🔹 Approach:
- Use postorder traversal (Left → Right → Root).
- For each node, collect information from left and right subtrees:
  • Whether subtree is BST
  • Size of subtree
  • Minimum value
  • Maximum value

- A subtree is a BST if:
  left.max < root.data < right.min

- If valid BST:
  → size = left.size + right.size + 1
- Else:
  → mark as not BST and propagate max size from children

- Keep track of the largest BST size globally.

🔹 Key Concepts:
- Binary Trees
- Binary Search Trees
- Postorder Traversal
- Divide and Conquer

🔹 Time Complexity:
O(n) → each node is visited once

🔹 Space Complexity:
O(h) → recursion stack (h = height of tree)

🔹 Output:
Returns the size (number of nodes) of the largest BST subtree.
*/
import java.util.*;

import q55.info;

// size of largest BST

public class q73 {
    public class node {
        int data;
        node left ;
        node right;

        public node (int data){
            this.data=data;
            left=null;
            right=null;
        }
    
}

public static class info{
    boolean isbst;
    int size;
    int min ;
    int max ;

    public info(boolean isbst ,int size , int min , int max ){
        this.isbst =isbst;
        this.size =size;
        this.min = min;
        this.max = max;

    }
}

static int maxsize =0; 
public static info  largestbst(node root ){
    
    if((root == null)){
       return  new info(true, 0, Integer.MAX_VALUE , Integer.MIN_VALUE);
    }

    info leftinfo = largestbst(root.left);
    info rightinfo = largestbst(root.right);
    int min = Math.min(root.data , Math.min(leftinfo.min, rightinfo.min));
    int max = Math.max(root.data , Math.max(leftinfo.max, rightinfo.max));
    int size = leftinfo.size + rightinfo.size + 1;


    if(root.data <= leftinfo.max || root.data >= rightinfo.min){
        return new info(false , size, min, max);
    }

    if(leftinfo.isbst && rightinfo.isbst){
        maxsize = Math.max(maxsize, size);
        return new info(true, size, min, max);
    }

    return new info(false, size, min, max);
}
