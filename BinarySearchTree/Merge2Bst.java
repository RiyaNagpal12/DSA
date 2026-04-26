import java.util.*;

public class q75 {

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

    // Inorder traversal (store values, not nodes)
    public static void inorder(ArrayList<Integer> list, node root) {
        if (root == null) return;

        inorder(list, root.left);
        list.add(root.data);   // ✅ fix
        inorder(list, root.right);
    }

    // Merge two sorted lists
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) < list2.get(j)) {
                result.add(list1.get(i));
                i++;
            } else {
                result.add(list2.get(j));
                j++;
            }
        }

        while (i < list1.size()) {
            result.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            result.add(list2.get(j));
            j++;
        }

        return result;
    }

    // Create BST from sorted list
    public static node createbst(ArrayList<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        node root = new node(list.get(mid));

        root.left = createbst(list, start, mid - 1);
        root.right = createbst(list, mid + 1, end);

        return root;
    }

    // Merge two BSTs
    public static node mergeBST(node root1, node root2) {
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inorder(list1, root1);
        inorder(list2, root2);

        ArrayList<Integer> finalList = merge(list1, list2); // ✅ fix

        return createbst(finalList, 0, finalList.size() - 1);
    }

    // Inorder print (for checking)
    public static void printInorder(node root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.data + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        // Tree 1
        node root1 = new node(2);
        root1.left = new node(1);
        root1.right = new node(4);

        // Tree 2
        node root2 = new node(9);
        root2.left = new node(3);
        root2.right = new node(12);

        node mergedRoot = mergeBST(root1, root2);

        printInorder(mergedRoot);  // Output should be sorted
    }
}
