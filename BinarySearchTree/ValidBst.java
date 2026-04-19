public class ValidBst {

   public static class node {
        int data;
        node left;
        node right ;
        public node (int data){
            this.data = data;
            left =null;
            right=null;
        }


    }

   


    public static boolean isvalid(node root, node min, node max) {
        if (root == null) {
            return true;
        }

        if (min != null && root.data <= min.data) {
            return false;
        }

        if (max != null && root.data >= max.data) {
            return false;
        }

      
        return isvalid(root.left, min, root) &&
               isvalid(root.right, root, max);
    }

     public static node create(node root , int value){
        if(root ==null){
            root = new node(value);
        }
        if(root.data<value){
            root.right =create(root.right, value);
        }
        if(root.data>value){
            root.left = create(root.left, value);
        }
        return root;
    }
    public static void main(String [] args){
                       int value[]={  5 ,1,3,4,2,7
                };

        node root = null;
        for (int i=0;i< value.length ;i++){
            root = create( root, value[i]);
            
    }
    if(isvalid(root, null,null)){
        System.out.println("Valid");
    }
    else{
        System.out.println("Invalid");
    }

    
}
}
