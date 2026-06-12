class node {
    int val;
    node left, right;

    node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class SumLeftRight {

    static int sum(node root) {
        if (root == null) {
            return 0;
        }

        return root.val + sum(root.left) + sum(root.right);
    }

    public static void main(String[] args) {

        node root = new node(10);
        root.left = new node(5);
        root.right = new node(15);
        root.left.left = new node(3);
        root.left.right = new node(7);
        root.right.right = new node(20);

        int leftSum = sum(root.left);
        int rightSum = sum(root.right);

        System.out.println("Left Subtree Sum = " + leftSum);
        System.out.println("Right Subtree Sum = " + rightSum);
    }
}