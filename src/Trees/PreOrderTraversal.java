package Trees;

class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;
    BinaryTree() {
        root = null;
    }
    void printPreorder(Node node) {     // Function to print preorder traversal
        if (node == null)
            return;
        System.out.print(node.data + " ");          // Deal with the node
        printPreorder(node.left);          // Recur on left subtree
        printPreorder(node.right);           // Recur on right subtree
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.printPreorder(tree.root);
    }
}