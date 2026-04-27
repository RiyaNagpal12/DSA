public class q69 {

    public static class node {
        int data ;
        node left ;
        node right;
        public node(int data){
            this.data = data ;
            left=null;
            right=null;
        }
    }

    public static node mirror(node root ){
        if(root == null){
            return null;
        }
        node lefts = mirror(root.left);
        node rights= mirror(root.right);

        root.left = rights;
        root.right=lefts;
        return root ;


    }
     public static node create(node root , int value){
        if(root == null){
            root = new node(value);

        }
        if(root.data > value){
           root.left =  create(root.left , value );
        }

        if(root.data <value){
            root.right = create(root.right , value);
        }
        return root;
    }

    public static void inorder(node root ){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
  
    public static void main(String[] args) {
                            int value[]={  5 ,1,3,4,2,7
                };

        node root = null;
        for (int i=0;i< value.length ;i++){
            root = create( root, value[i]);
            
    }

    inorder(root);

    mirror(root);
    inorder(root);


    
    }
    
}
