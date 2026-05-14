// public class maxsorted {
//     static int maxsorted(int [][] arr){
//         int rows=arr.length;
//         int cols=arr[0].length;

//         int row=0;
//         int col=cols-1;
        
//         int maxsorted=-1;
//         while(row<rows && col>=0){
//             if(arr[row][col]==1){
//                maxsorted=row;
//                col--;
//             }else{
//                 row++;
//             }
//         }
//         return maxsorted;
//     }
//     public static void main(String[] args) {
//          int[][] arr = {
//                 {0, 0, 0, 1},
//                 {0, 1, 1, 1},
//                 {0, 0, 1, 1},
//                 {1, 1, 1, 1}
//         };
//        int result=maxsorted(arr);
//        System.out.println("row with max sorted  "+result);
//     }
// }
