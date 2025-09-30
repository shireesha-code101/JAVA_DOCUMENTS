package day15_java;

class Nodes {
    int data;
    Nodes left, right;
    Nodes(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinarySearchTree {
    private Node root;
    private int size;

    public BinarySearchTree() {
        this.root = null;
        this.size = 0;
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            size++;
        } else {
            insert(data, root);
        }
    }

    private void insert(int data, Node node) {
        if (data < node.data) {
            if (node.left == null) {
                node.left = new Node(data);
                size++;
            } else {
                insert(data, node.left);
            }
        } else if (data > node.data) {
            if (node.right == null) {
                node.right = new Node(data);
                size++;
            } else {
                insert(data, node.right);
            }
        }
    }

    public void inorderTraversal() {
        inorder(root);
    }

    private void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    public int getSize() {
        return size;
    }

    public Node getRoot() {
        return root;
    }
}
