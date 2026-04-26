
/* ✔ Problem: Convert BST to Balanced BST

✔ Approach:
- Performed inorder traversal to get sorted elements
- Used divide & conquer to build balanced BST
- Selected middle element as root for height balance

✔ Complexity:
- Time: O(n)
- Space: O(n)

✔ Key Concept:
BST → Sorted Array → Balanced BST */

import java.util.ArrayList;

// convertedbst to balanced bst 
public class convert{

    public static class node {
        int data;
        node left;
        node right ;

        public node(int data){
            this.data = data ;
            left = null;
            right =  null;


        }
    }

        public static void   inorder(node root , ArrayList<Integer> list ){

            if(root == null){
                return;
            }
            
            inorder(root.left , list);
            list.add(root.data);
            inorder(root.right, list);

        }

        public static node  createbst( ArrayList<Integer> list , int start , int end  ){
            if (start > end) return null;

            int mid =(start+end)/2;
            node root = new node(list.get(mid));
            root.left =createbst(list , start , mid-1);
            root.right = createbst(list ,   mid+1 , end);
            return root ;

        }

        public static node convertbst(node root ){
            ArrayList<Integer> list = new ArrayList<>();
            inorder(root , list);
            return  createbst(list, 0, list.size()-1);

        }
