



//  class node {
// int val;
// node next;

// node(int val){
//    this.val=val;
//     this.next=null;

// }
// }

//  class linkedlist{
//     node head;
//     node tail;

//     // add to head
//     void AtHead(int val){
//         node temp= new node(val);
             
//         if(head==null){
//             head=tail=temp;

//         }else{
//             temp.next=head;
//             head=temp;

//         }
//     }
//      void AddToTail(int val){
//         node temp= new node(val);

//         if(tail == null){
//             head=tail=temp;

//         }else{
//             tail.next=temp;
//             tail=temp;
//         }
//      }
//       void printll(){
//         if(head==null){
//             System.out.println("linkedlist is empty");
//             return;
//         }
//         node temp=head;
//         while(temp!=null){
//             System.out.println(temp.val+" -> ");
//             temp=temp.next;
//         }
//         System.out.println("null");
//       }
//  }
// public class operation {
//    public static void main(String[] args) {
//       linkedlist ll= new linkedlist();
//       ll.AddToTail(50);
//       ll.AtHead(10);

//       ll.printll();
//    }   
// }


// class node {
//     int val;
//     node next;

//     node(int val) {
//         this.val = val;
//         this.next = null;
//     }
// }

// class linkedlist {
//     node head;
//     node tail;

//     // add at head
//     void AtHead(int val) {
//         node temp = new node(val);

//         if (head == null) {
//             head = tail = temp;
//         } else {
//             temp.next = head;
//             head = temp;
//         }
//     }

//     // add at tail
//     void AddToTail(int val) {
//         node temp = new node(val);

//         if (tail == null) {
//             head = tail = temp;
//         } else {
//             tail.next = temp;
//             tail = temp;
//         }
//     }

//     // delete at head
//     void deleteAtHead() {
//         if (head == null) {
//             System.out.println("linked list is empty");
//             return;
//         }

//         head = head.next;

//         // if list becomes empty
//         if (head == null) {
//             tail = null;
//         }
//     }

//     // print linked list
//     void printll() {
//         if (head == null) {
//             System.out.println("linkedlist is empty");
//             return;
//         }

//         node temp = head;

//         while (temp != null) {
//             System.out.print(temp.val + " -> ");
//             temp = temp.next;
//         }

//         System.out.println("null");
//     }
// }

// public class operation {
//     public static void main(String[] args) {

//         linkedlist ll = new linkedlist();

//         ll.AddToTail(50);
//         ll.AtHead(10);
//         ll.AddToTail(900);
//         ll.AtHead(5090);

//         ll.printll();

//         ll.deleteAtHead();
//         ll.printll();
//     }
// }