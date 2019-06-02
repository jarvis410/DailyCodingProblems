package extra.ds.tree;

class Node {
    String data;
    Node left, right;

    public Node(String data) {
        this.data = data;
        left = right = null;
    }
}

public class BinaryTreeLinkedList {
    Node root;

    BinaryTreeLinkedList() {
        root = null;
    }

    BinaryTreeLinkedList(String data) {
        root = new Node(data);
        System.out.println("Root node " + data + " created");
    }

    public void printPreOrder(Node node) {
        if(node == null)
            return;

        System.out.print(node.data + " ");
        printPreOrder(node.left);
        printPreOrder(node.right);
    }

    public void printInOrder(Node node) {
        if ( node == null)
            return;

        printInOrder(node.left);
        System.out.print(node.data + " ");
        printInOrder(node.right);
    }

    public void printPostOrder(Node node) {
        if(node == null)
            return;

        printPostOrder(node.left);
        printPostOrder(node.right);
        System.out.print(node.data + " ");
    }

    void printPreOrder() {
        printPreOrder(root);
        System.out.println();
    }

    void printInOrder() {
        printInOrder(root);
        System.out.println();
    }

    void printPostOrder() {
        printPostOrder(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinaryTreeLinkedList bt = new BinaryTreeLinkedList();

        bt.root = new Node("A");

        bt.root.left = new Node("B");
        bt.root.right = new Node("C");

        bt.printPreOrder();
        bt.printInOrder();
        bt.printPostOrder();
    }
}
