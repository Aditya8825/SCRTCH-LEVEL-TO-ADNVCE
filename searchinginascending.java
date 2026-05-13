// public class searchinginascending {
//     static int search (int[]arr,int target){
//         int left=0;
//         int right=arr.length-1;

//         while(left<right){
//             int mid=(left+right)/2;

//             if(arr[mid]==target){
//                 return mid;

//             }if(target<arr[mid]){
//                 right=mid-1;
//             }else{
//                 left=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         int result=search(arr,6);
//         System.out.println("index of "+6+result);

//     }
// }
