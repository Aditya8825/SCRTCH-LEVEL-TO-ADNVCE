// public class search{
//     static int search(int []arr,int target){
//         int left=0;
//         int right=arr.length-1;

//         while(left<=right){
//             int mid=(left+right)/2;

//             //element found
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(target<arr[mid]){
//                 right=mid-1;
//             }
//             else{
//                 left=mid+1;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args) {
//         int []arr={1,2,3,4,5,6,7,7,8,9};
//         int result = search(arr,7);
//         System.out.println("index of "+7+" is = "+result);
//     }
// }