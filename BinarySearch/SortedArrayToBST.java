public class SortefArrayToBst {

    public static class node {
        int data;
        node left;
        node right;

        public node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    // sorted array → BST
    public static node bst(int arr[], int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = (start + end) / 2;

        node root = new node(arr[mid]);

        root.left = bst(arr, start, mid - 1);
        root.right = bst(arr, mid + 1, end);

        return root;
    }

    // inorder traversal
    public static void inorder(node root) {
        if (root == null) return;

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6, 7};

        node root = bst(arr, 0, arr.length - 1);

        System.out.print("Inorder of BST: ");
        inorder(root);  
}
