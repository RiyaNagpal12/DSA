/* implements the Lowest Common Ancestor (LCA) and distance between two nodes in a binary tree.

Approach:
- Find path from root to each node using recursion and backtracking
- Compare both paths to determine the Lowest Common Ancestor (LCA)
- Compute distance from LCA to each node
- Total distance = distance(LCA → n1) + distance(LCA → n2)

Concepts Used:
- Tree traversal (DFS)
- Backtracking
- ArrayList for path storage

Time Complexity: O(n)
Space Complexity: O(n)*/

import java.util.ArrayList;

public class  LCA {
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

  public static boolean getpath(node root, int n, ArrayList<node> path) {
    if (root == null) {
        return false;
    }

    path.add(root); // add current node

    if (root.data == n) {
        return true;
    }

    if (getpath(root.left, n, path) || getpath(root.right, n, path)) {
        return true;
    }

    path.remove(path.size() - 1); // backtrack
    return false;
}
    

    public static node lca(node root , int n1 , int n2){
        ArrayList <node> path1 = new ArrayList<>();
        ArrayList <node> path2= new ArrayList<>();
        getpath(root , n1 , path1);
        getpath(root,n2 , path2);
        int i =0;
        while(i<=path1.size() && i<=path2.size()){
            if(path1.get(i)!=path2.get(i)){
                break;
            }

            i++;

        }

        node lca = path1.get(i-1);
        return lca;

    }

    public static int lcadist(node root , int n){
        if(root==null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int left = lcadist(root.left, n);
        int right= lcadist(root.right, n);
        if(left==-1&&right==-1){
            return -1;
        }
        if(left ==-1){
            return right+1;
        }
        else{
            return left+1;
            }

        }


    public static int distance (node root , int n1 , int n2){
        node lca = lca(root, n1, n2);
       int distance1= lcadist(lca, n1);
       int distance2= lcadist(lca, n2);
       return distance1+distance2;



    }


    
