package extra.ds.tree;

/**
 * Array Implementation of Binary Tree
 */
public class BinaryTreeArray {
    public static void main(String[] args) {
        ArrayImpl bt = new ArrayImpl();

        bt.createRoot("A");
        bt.setLeftNode("B", 0);
        bt.setRightNode("C", 0);
        bt.setLeftNode("D", 1);
        bt.setRightNode("E", 2);

        bt.printTree();
    }
}

class ArrayImpl {
    static int root = 0;
    static String[] nodes = new String[10];

    public void createRoot(String data) {
        nodes[0] = data;
        System.out.println("Root node " + data + " created.");
    }

    public void setLeftNode(String data, int parent) {
        int pos;

        if (nodes[parent] == null) {
            System.out.println("No such parent exists.");
        } else {
            pos = (parent * 2) + 1;
            nodes[pos] = data;
        }

        System.out.println(data + " added to left of " + nodes[parent]);
    }

    public void setRightNode(String data, int parent) {
        int pos;

        if (nodes[parent] == null) {
            System.out.println("No such parent exists.");
        } else {
            pos = (parent * 2) + 2;
            nodes[pos] = data;
        }

        System.out.println(data + " added to right of " + nodes[parent]);
    }

    public void printTree() {
        for (int i = 0; i < 10; i++) {
            if (nodes[i] != null)
                System.out.print(nodes[i] + " ");
            else
                System.out.print("_ ");
        }
    }
}
