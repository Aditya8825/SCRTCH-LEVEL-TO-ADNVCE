// class node {
//     int val;
//     node left, right;

//     node(int val) {
//         this.val = val;
//         left = right = null;
//     }
// }

// public class lca {

//     static node lca(node root, int n1, int n2) {
//         if (root == null) {
//             return null;
//         }

//         if (root.val == n1 || root.val == n2) {
//             return root;
//         }

//         node left = lca(root.left, n1, n2);
//         node right = lca(root.right, n1, n2);

//         if (left != null && right != null) {
//             return root;
//         }

//         return (left != null) ? left : right;
//     }

//     public static void main(String[] args) {
//         node root = new node(1);

//         root.left = new node(2);
//         root.right = new node(3);
//         root.left.left = new node(4);
//         root.left.right = new node(5);

//         node ans = lca(root, 4, 5);

//         System.out.println("LCA = " + ans.val);
//     }
// }