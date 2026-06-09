// class node {
//     int val;
//     node left;
//     node right;

//     node(int val) {
//         this.val = val;
//     }
// }

// public class binarytree {

//     public static void main(String[] args) {
//         node a = new node(20);
//         node b = new node(10);
//         node c = new node(30);
//         node d = new node(40);
//         node e = new node(50);

//         a.left = b;
//         a.right = c;
//         b.left = d;
//         b.right = e;

//         display(a);
//     }

//     public static void display(node root) {
//         if (root == null) return;

//         System.out.print(root.val + " ");

//         display(root.left);
//         display(root.right);
//     }
// }