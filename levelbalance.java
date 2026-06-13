// class Solution {
//     public boolean isBalanced(Node root) {
//         // code here
//         if(root==null){
//             return true;
//         }
//         int leftlevel=level(root.left);
//         int rightlevel= level(root.right);
//         if(Math.abs(leftlevel-rightlevel)>1) return false;
        
//         return isBalanced(root.left)&& isBalanced(root.right);
//     }
//     private int level(Node root){
//         if(root==null) return 0;
//         return 1+Math.max(level(root.left),level(root.right));
//     }
// }       