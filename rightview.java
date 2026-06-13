
// class node{
//     int val;
//     node left,right;


//     node(int val){

//     this.val=val;
//     left=right=null;
// }
// }
// public class rightview{
//     static int maxlevel=0;
//     static void rightview(node root,int level){
//         if(root==null){
//             return;
//         }
//        if(level>maxlevel){
//         System.out.println(root.val+" ");
//         maxlevel=level;
//        }
//        rightview(root.right,level+1);
//        rightview(root.left,level+1);
//     }
//     public static void main(String[] args) {
//         node n= new node(1);
//         n.left= new node(2);
//         n.right= new node(3);
//         n.left.left=new node(4);
//         n.right.right= new node(6);

//         System.out.println("right view: ");
//         rightview(n,1);
        
//     }
// }