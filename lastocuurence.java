

// public class lastocuurence {
//     static int search(int[]arr,int target){
//         int left=0;
//         int right=arr.length-1;
//         int ans=-1;

//         while(left<right){
//             int mid=(left+right)/2;

//             if(arr[mid]==target){
//                 ans=mid;
//                 left=mid+1;
//             }else if(arr[mid]<target){
//                 left=mid+1;
//             }else{
//                 right=mid-1;
//             }
//         }
//         return ans;
//     }
//       public static void main(String[] args) {
//         int []arr={1,2,3,4,5,6,6,6};
        
//          int target=6;
//           int result=search(arr,target);
//           if(result !=-1){
//             System.out.println("element=: "+arr[result]+" at index of "+result);
//           }
//       }
// }
