// import java.util.NoSuchElementException;

// import org.w3c.dom.Node;

// public class operation {
//     static class MyQueue {
//     Node head;
//     Node tail;
//     int size;

//     void add(int val) { // enqueue
//         Node temp = new Node(val);

//         if (tail == null) {
//             head = tail = temp;
//         } else {
//             tail.next = temp;
//             tail = temp;
//         }

//         size++;
//     }

//     int remove() { // dequeue
//         if (isEmpty()) {
//             throw new NoSuchElementException("Queue is empty");
//         }

//         int front = head.val;
//         head = head.next;

//         if (head == null) {
//             tail = null;
//         }

//         size--;
//         return front;
//     }

//     int peek() { // front element
//         if (isEmpty()) {
//             throw new NoSuchElementException("Queue is empty");
//         }
//         return head.val;
//     }

//     boolean isEmpty() {
//         return size == 0;
//     }

//     int size() {
//         return size;
//     }

//     void display() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }

//         System.out.println();
//     }

//     void clear() {
//         head = null;
//         tail = null;
//         size = 0;
//     }
// }
// }
