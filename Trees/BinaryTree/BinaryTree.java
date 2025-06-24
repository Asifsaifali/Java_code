
public class BinaryTree {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static int index = -1;

    public static Node BuildTree(int node[]) {
        index++;
        if (node[index] == -1)
            return null;

        Node newNode = new Node(node[index]);
        newNode.left = BuildTree(node);
        newNode.right = BuildTree(node);
        return newNode;
    }

    public static void PreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void Inorder(Node root) {
        if (root == null)
            return;
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    public static void PostOrder(Node root) {
        if (root == null)
            return;

        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) throws IndexOutOfBoundsException {
        int node[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTree tree = new BinaryTree();
        Node root = tree.BuildTree(node);
        tree.Inorder(root);
    }

}
