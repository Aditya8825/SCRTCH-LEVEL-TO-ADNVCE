// import java.util.PriorityQueue;

// public class NearlySorted {

//     public static void nearlySorted(int[] arr, int k) {

//         int idx = 0;
//         PriorityQueue<Integer> pq = new PriorityQueue<>();

//         for (int ele : arr) {
//             pq.add(ele);

//             if (pq.size() > k) {
//                 arr[idx++] = pq.remove();
//             }
//         }

//         while (!pq.isEmpty()) {
//             arr[idx++] = pq.remove();
//         }
//     }

//     public static void main(String[] args) {

//         int[] arr = {6, 5, 3, 2, 8, 10, 9};
//         int k = 3;

//         nearlySorted(arr, k);

//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }