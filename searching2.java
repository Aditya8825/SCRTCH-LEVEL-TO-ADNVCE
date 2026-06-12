// class node{
//     int val;
//     node left,right;

//     node(int val){
//         this.val=val;
//         left=right=null;

//     }
// }
// public class searching2{
//     static boolean searching (node root,int key){
//         if(root==null){
//             return false;
//         }
//         if(root.val==key){
//             return true;
//         }
//      if(key<root.val)
//        return searching(root.left,key);

//        return searching(root.right,key);

//     }
//     public static  void  main(String[]args){
//        node root= new node(10);
//         root.left = new node(5);
//         root.right = new node(20);
//         root.left.left = new node(3);
//         root.left.right = new node(7);

//         int key=30;
//         if(searching(root,key)){
//             System.out.println(" element found ");
//         }else{
//             System.out.println("elemnt not found ");
//         }
//     }
// }
