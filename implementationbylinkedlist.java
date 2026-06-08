// import java.util.*;

// public class ImplementationByLinkedList {

//     static class Node {
//         int val;
//         Node next;

//         Node(int val) {
//             this.val = val;
//         }
//     }

//     static class MyQueue {
//         Node head;
//         Node tail;
//         int size;

//         void add(int val) {
//             Node temp = new Node(val);

//             if (tail == null) {
//                 head = tail = temp;
//             } else {
//                 tail.next = temp;
//                 tail = temp;
//             }

//             size++;
//         }

//         int remove() {
//             if (head == null) {
//                 throw new NoSuchElementException("Queue is empty");
//             }

//             int front = head.val;
//             head = head.next;

//             if (head == null) {
//                 tail = null;
//             }

//             size--;
//             return front;
//         }

//         int size() {
//             return size;
//         }
//     }
// }