
// class node{
//      int val;
//      node left,right;

//      node(int val){
//         this.val=val;
//         left=right=null;

//      }
// }
// public class level {
//     static int level(node root ,int key,int lvl){
//         if(root==null){
//             return -1;
//         }
//         if(root.val==key){
//             return lvl;
//         }
//         int leftlevel = level(root.left, key,lvl+1);
//         if(leftlevel != -1){
//             return leftlevel;
//         }
//         return level(root.right,key,lvl+1);

//         int key = 7;

//         int result = level(root, key, 0);

//         if (result != -1) {
//             System.out.println("Level of node " + key + " is: " + result);
//         } else {
//             System.out.println("Node not found");
//         }
//     }
// }
    
//     public static void main(String[] args) {
        
//     }
// }
