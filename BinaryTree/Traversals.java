public class Traversals {

    public static class node {
        int data ;
        node left;
        node right;

        node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
        public static class binarytree{
            static int index=-1;

        public static node createtree(int nodes[]){
            index++;
            if(nodes[index]==-1){
                return null;
            }

            node newnode = new node(nodes[index]);
            newnode.left= createtree(nodes);
            newnode.right= createtree(nodes);

            return newnode;
        }

   
        
        
    }

    
    public static void preorder(node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

  

    public static void inorder(node root){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }


    public static void postorder(node root ){
        if(root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    


    public static void main(String[] args) {
        
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        binarytree tree = new binarytree();
        node root = tree.createtree(nodes);
        preorder(root);
        System.out.println("");
        inorder(root);
        System.out.println("");
        postorder(root);
        
    }
    }
    
