
// class node{
//     int val;
//     node left, right;

//     node(int val){
//         this.val=val;
//         left=right=null;
//     }
// }
// public class identialtree {
//      static boolean identailS(node root1, node root2){
//         if(root1==null && root2==null){
//             return true;
//         }
//         if(root1==null || root2==null){
//             return false;
//         }
//         return root1.val==root2.val  && identailS(root1.left, root2.left)
//         && identailS(root1.right, root2.right);
//      }
//      public static void main(String[] args) {
//         node n= new node(10);
//          n.left= new node(5);
//          n.right= new node(15);
//         n.left.left= new node(3);
//         n.left.right= new node(7);
//         n.right.right= new node(20);

//         //tree2
//           node n2 = new node(10);
//         n2.left = new node(5);
//         n2.right = new node(15);
//         n2.left.left = new node(3);
//         n2.left.right = new node(0);
//         n2.right.right = new node(20);


//      System.out.println("are the idential ? "+ identailS(n, n2));
//       //  System.out.println(n.boolean);

//      }
// }
