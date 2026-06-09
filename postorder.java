

// class node{
//     int val;
//     node head;
//     node left;
//     node right;

//     node(int val){
//         this.val=val;
//     }
// }

// public class postorder {
//     public static void main(String[] args) {
//          node b = new node(10);
//            node a = new node(10);
//         node c = new node(30);
//         node d = new node(40);
//         node e= new node(50);

//         a.left=b;
//         a.left=c;
//         b.left=d;
//         b.right=e;
//         postorder(a);

//     }
//     static void postorder(node root){
//         if(root==null) return;

//         postorder(root.left);
//         postorder(root.right);
//         System.out.println(root.val+" ");
//     }
// }
