// class node{
//     int val;
//     node head;
//     node left;
//     node right;

//     node(int val){
//         this.val=val;
//     }
// }
// public class productofroot {
//     static int product(node root){
//         if(root==null){
//             return  1;
//         }
//         return root.val*product(root.right)*product(root.left);
//     }
//     public static void main(String[] args) {
//         node n= new node(10);
//         n.left=new node(5);
//         n.right= new node(15);
//         System.out.println(product(n));
//     }
// }
