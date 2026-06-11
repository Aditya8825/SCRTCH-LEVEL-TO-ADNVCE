


// class node{
//     int val;
//     node left,right;

//     node(int val){
//         this.val=val;
//         left=right=null;
//     }
// }
// public class mirror {
//     // function to convert
//     static void mirror(node root){
//         if(root==null){
//             return;
//         }
//         // mirroe left and right subtree
//         mirror(root.left);
//         mirror(root.right);

//         // swap left and right children
//         node temp=root.left;
//         root.left=root.right;
//         root.right=temp;
//     }
//     static void inorder(node root){
//         if(root==null){
//             return;
//         }
//         inorder(root.left);
//         System.out.println(root.val+" ");
//         inorder(root.right);
//     }
//     public static void main(String[] args) {
//         node n= new node(10);
//         n.left= new node(5);
//         n.right= new node(15);
//         n.left.left= new node(3);
//         n.left.right= new node(7);
//         n.right.right= new node(20);

//        System.out.println("before mirror: ");
//        inorder(n);
          
//         mirror(n);
//         System.out.println("mirror tree  :");
//         inorder(n);
//     }
// }



// class node{
//     int val;
//     node left;
//     node right;

//     node(int val){
//     this.val=val;
//     left=right=null;
// }
// }
// public class mirror
// {
//     static void mirror(node root){
//     if(root==null){
//         return;
//     }
//         mirror(root.left);
//         mirror(root.right);


//         //swape functio
//         node temp = root.left;
//         root.left=root.right;
//         root.right=temp;
// }
// static void inorder(node root){
//     if(root==null){
//         return;
//     }
//     inorder(root.left);
//     System.out.println(root.val+" ");
//     inorder(root.right);
// }
// public static void main(String[] args) {
//     node n= new node(10);
//     // node n= new node(10);
//         n.left= new node(5);
//         n.right= new node(15);
//         n.left.left= new node(3);
//         n.left.right= new node(7);
//         n.right.right= new node(20);

//        System.out.println("before mirror: ");
//        inorder(n);
          
//         mirror(n);
//         System.out.println("mirror tree  :");
//         inorder(n);
//     }
// }
