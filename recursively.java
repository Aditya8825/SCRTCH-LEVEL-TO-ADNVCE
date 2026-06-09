

// class node{
//     int val;
//     node head;
//     node left;
//     node right;

//     node(int val){
//         this.val=val;
//     }
// }

// public class recursively {
//     public static void main(String[] args) {
//          node b = new node(10);
//            node a = new node(10);
//         node c = new node(30);
//         node d = new node(40);
//         node e= new node(50);

//         a.left=b;
//         a.right=c;
//         b.left=d;
//         b.right=e;
//      System.out.println(a.val);
//      System.out.println(size(a));
//     }
//         static  int  size(node root){
//                if(root==null) return 0;
//                int leftsize =size(root.left);
//                int rightsize =size(root.right);
//                return 1 + leftsize+ rightsize;
//         }
//     static void postorder(node root){
//         if(root==null) return;
//          return 1
//        System.out.println(root.left);
//        System.out.println(root.right);
//         System.out.println(root.val+" ");
//     }
// }
