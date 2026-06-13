
// class node{
//     int val;
//     node left,right;

//     node(int val){
//     this.val= val;
//     left=right=null;
// }
// }

// public class leftview {
//       static int maxlevel=0;

//     static void leftview(node root,int level){
//         if(root==null){
//             return;
//         }
//         if(level>maxlevel){
//             System.out.println(root.val+" ");
//             maxlevel=level;
//         }
//         leftview(root.left,level+1);
//         leftview(root.right,level+1);
//     }
//     public static void main(String[] args) {
//         node n = new node(1);
//         n.left= new node(2);
//         n.right= new node(3);
//         n.right.right= new node(6);
//         n.left.left=new node(5);
//         System.out.println("left view : ");
//         leftview(n,1);
//     }
// }
