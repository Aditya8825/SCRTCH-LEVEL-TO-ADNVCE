
// class Node {
//     int val;
//     Node left, right;

//     Node(int val) {
//         this.val = val;
//     }
// }

// public class distancebetweennode{

//     static Node lca(Node root, int a, int b) {
//         if (root == null)
//             return null;

//         if (root.val == a || root.val == b)
//             return root;

//         Node left = lca(root.left, a, b);
//         Node right = lca(root.right, a, b);

//         if (left != null && right != null)
//             return root;

//         return left != null ? left : right;
//     }

//     static int level(Node root, int key) {
//         if (root == null)
//             return -1;

//         if (root.val == key)
//             return 0;

//         int left = level(root.left, key);
//         if (left != -1)
//             return left + 1;

//         int right = level(root.right, key);
//         if (right != -1)
//             return right + 1;

//         return -1;
//     }

//     static int distance(Node root, int a, int b) {
//         Node lcaNode = lca(root, a, b);

//         return level(lcaNode, a) + level(lcaNode, b);
//     }

//     public static void main(String[] args) {

//         Node root = new Node(1);
//         root.left = new Node(2);
//         root.right = new Node(3);
//         root.left.left = new Node(4);
//         root.left.right = new Node(5);

//         System.out.println("Distance = " + distance(root, 4, 5));
//     }
// }