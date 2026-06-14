// // import java.util.*;

// // public class heapdeletion {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner (System.in);
// //         PriorityQueue<Integer>minHeap= new PriorityQueue<>();

// //         System.out.println("enter size of heap : ");
// //         int size= sc.nextInt();


// //         //sout
// //     System.out.println("enter element ");
// //     int n= sc.nextInt();

// //     for(int i=0; i<n; i++){
// //         minHeap.add(sc.nextInt());
// //     }
// //   System.out.println("delete element "+minHeap.poll());

// //   System.out.println("remaining heap: ");
// //   while(!minHeap.isEmpty()){
// //     System.out.println(minHeap.poll()+" ");
// //   }


// //     }
// // }


// import java.util.*;

// public class heapdeletion{
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);
//         PriorityQueue<Integer> minHeap = new PriorityQueue<>();

//         System.out.print("Enter size of heap: ");
//         int size = sc.nextInt();

//         System.out.println("Enter elements:");

//         for(int i = 0; i < size; i++) {
//             minHeap.add(sc.nextInt());
//         }

//         System.out.println("Deleted element: " + minHeap.poll());

//         System.out.println("Remaining heap:");

//         while(!minHeap.isEmpty()) {
//             System.out.print(minHeap.poll() + " ");
//         }
//     }
// }