

// class node{
//     int val;
//     node left,right;

//     node(int val){
//         this.val=val;
//         left=right=null;
//     }
//     static boolean ismirror(node left, node right){
//         if(left==null && right ==null){
//             return true;
//         } 
//         if(left==null || right ==null){
//             return false;

//         }
//         return left.val==right.val && ismirror(left.left, right.right)
//         && ismirror(left.right, right.left);
//     }
//     static boolean issymmteric(node root){
//         if(root==null){
//             return true;
//         }
//     return ismirror(root.left,root.right);
// }
// public class symmtery {
//     public static void main(String[] args) {
// node n= new node(10)
//     }
// }


// class node {
//     int val;
//     node left, right;

//     node(int val) {
//         this.val = val;
//         left = right = null;
//     }

//     static boolean ismirror(node left, node right) {
//         if (left == null && right == null) {
//             return true;
//         }

//         if (left == null || right == null) {
//             return false;
//         }

//         return left.val == right.val
//                 && ismirror(left.left, right.right)
//                 && ismirror(left.right, right.left);
//     }

//     static boolean issymmetric(node root) {
//         if (root == null) {
//             return true;
//         }

//         return ismirror(root.left, root.right);
//     }
// }

// public class symmetry {
//     public static void main(String[] args) {

//         node n = new node(10);
//         n.left = new node(5);
//         n.right = new node(5);

//         n.left.left = new node(3);
//         n.left.right = new node(7);

//         n.right.left = new node(7);
//         n.right.right = new node(3);

//         System.out.println("Is Symmetric? " +
//                 node.issymmetric(n));
//     }
// }