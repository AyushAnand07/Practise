package Trees;
import java.io.IOException;

public class CreatePreorderTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data)   //Constructor to set values
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int index= -1;           //will increment this to the array length
        public static Node buildTree(int[] nodes) {
            index++;
            if(nodes[index]== -1) //it checks if -1 is the first element in array meaning root = null which isnt possible hence return null
                return null;

            Node newNode= new Node(nodes[index]);  //sends data to Node class constructor
            newNode.left= buildTree(nodes);         //Creating tree nodes recursively
            newNode.right= buildTree(nodes);

            return newNode;
        }
    }

    public static void preOrder(Node root)
    {
        if(root== null) {
            return;
        }
        System.out.print(root.data +" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root)
    {
        if(root== null) {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data +" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root)
    {
        if(root== null) {
            return;
        }

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data +" ");
    }

    public static void main(String[] args) throws IOException {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Node root = BinaryTree.buildTree(nodes);
        //System.out.println(root.data);  //if 1 is printed as root that means the data is stored correctly
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
    }
}
