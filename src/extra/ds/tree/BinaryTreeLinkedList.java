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

    public static void main(String[] args) {
        BinaryTreeLinkedList bt = new BinaryTreeLinkedList();

        bt.root = new Node("A");

        bt.root.left = new Node("B");
        bt.root.right = new Node("C");
    }
}
