
// public class basicbinarysearch {
//     static int basicbinarysearch(int[]arr,int target){
//         int low=0;
//         int high=arr.length-1;

//         while(low<=high){
//             int mid=(low+high)/2;

//             if(arr[mid]==target){
//                 return mid;
//             }
//             else if(arr[mid]<target){
//                 low=high+1;
//             }
//             else {
//                 high=mid-1;
//             }
//         }
//         return-1;
//     }
//     public static void main(String[] args) {
//         int[]arr={1,2,3,4,57,8};
//         System.out.print(basicbinarysearch(arr,57));
//     }
// }
