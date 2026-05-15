// public class firstoccurence {
//     static int searching(int[]arr,int target){
//         int left=0;
//         int right=arr.length-1;

//         int ans=-1;

//         while(left<=right){

//             int mid=(left+right)/2;


//            if(arr[mid]==target){
//             ans=mid;
//             right=mid-1;

//            }
//            else if(arr[mid]<target){
//              left=mid+1;
//            }
//            else{
//             right=mid-1;
//            }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int []arr={1,2,2,2,3};
//         int target=3;
//         int index=searching(arr,target);
         
//         if(index !=-1){
//             System.out.println("element=: "+arr[index]+" at index of "+index);
//           //  System.out.println("index: "+index);
//         }else{
//             System.out.println("element not found");
//         }
//     }
// }
