// import java.util.*;
// public class kthsmallest{
//     public static int kthsmallest(int []arr,int k){
//         PriorityQueue<Integer>pq= new PriorityQueue<>(Collections.reverseOrder());
//         for(int ele:arr){
//             pq.add(ele);
//             if(pq.size()>k) pq.remove();
//         }
//         return pq.peek();
//     }
//     public static void main(String[] args) {
//         int[]arr={7,10,4,3,20,15};
//         int k=3;

//         System.out.println("kth smallest element= "+kthsmallest(arr,k));
//     }
// }