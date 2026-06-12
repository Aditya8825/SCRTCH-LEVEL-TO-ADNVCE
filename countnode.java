
// class node{
//     int val;
//     node left,right;

//     node(int val){
//         this.val=val;
//         left=right=null;
//     }
// }

// public class countnode {
//     static int countnodes(node root){
//         if(root==null){
//             return 0;
//         }
//         return  1+ countnodes(root.left)+countnodes(root.right);
//     }
//     public static void main(String[] args) {
//         node n= new node(10);
//         n.left= new node(5);
//         n.right=new node(15);
//         n.left.left= new node(3);
//         n.right.right= new node(20);

//         System.out.println(" total number of node: "+countnodes(n));

//     }
// }
