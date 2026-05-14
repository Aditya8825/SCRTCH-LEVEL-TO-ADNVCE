// public class searchinginmatrix{
//     public static boolean search(int[][]arr,int target){
//         int rows=arr.length;
//         int cols=arr[0].length;

//         //start from top-right corner
//         int row=0;
//         int col=cols-1;

//         while(row<rows && col>=0){
//             if(arr[row][col]==target){
//             return true;
//         }
//         else if(arr[row][col]>target){
//             col--;
//         }
//       else{
//         row++;
//       }
//     }
//         return false;
//     }
//     public static void main(String[] args) {
//          int[][] arr = {
//                 {10, 20, 30, 40},
//                 {15, 25, 35, 45},
//                 {27, 29, 37, 48},
//                 {32, 33, 39, 50}
//         };
      
//         boolean found=search(arr,29);
//         if(found){
//             System.out.println("element found");
//         }else{
//             System.out.println("not found");
//         }
//     }
// }