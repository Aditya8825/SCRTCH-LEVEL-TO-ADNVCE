
// import java.util.*;

// public class reversequeue {
    
//   static void reverseQueue(Queue<Integer>queue){
//     if(queue.isEmpty()){
//         return;
//     }
//     // remove font element
//      int front =queue.poll();

//      //recursively reverse remaining queue
//      reverseQueue(queue);

//      //add remove element to the rear
//      queue.offer(front);
//   }
//     public static void main(String[] args) {
//         Queue<Integer>queue= new LinkedList<>();
//         queue.offer(1);
//          queue.offer(2);
//         queue.offer(3); 
//         queue.offer(4);
//         queue.offer(5);

//         //display original queue
//         System.out.println("original qeueu: "+ queue);

//         //reverse the qeueu
//         reverseQueue(queue);
//           System.out.println("reversed qeueu : "+ queue);
//     }
// }
