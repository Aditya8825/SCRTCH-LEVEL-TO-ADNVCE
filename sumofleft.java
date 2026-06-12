// class node{
//     int val;
//     node left,right;

//     node(int val){
//         this.val=val;
//         left=right=null;
//     }
// }

// public class sumofleft {
//     static int sumofleft(node root){
//         if(root==null){
//             return 0;
//         }
//         return  root.val+ sumofleft(root.right)+sumofleft(root.left);
//     }
//     public static void main(String[] args) {
//         node n = new node(10);
//         n.left=new node(5);
//         n.right= new node(15);
//         n.left.left=new node(3);
//         System.out.println("sum of left node : "+sumofleft(n.left));
//     }
// }
