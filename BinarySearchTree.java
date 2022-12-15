package BinarySearchTree;

public class BinarySearchTree {
    Node root;

    public Node insert(Node root, int data) {
        /*
         * add root and data
         */
        if (root == null) {
            root = new Node(data);
            return root;

        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else {
            root.right = insert(root.right, data);
        }
        return root;
    }

    public void addData(int data) {
        root = insert(root, data);
    }

    public void print(Node root) {
        if (root == null) {
            return;
        }
        print(root.left);
        System.out.print(root.data + " ");
        print(root.right);
    }

    public void printData() {
        print(root);

    }
}
