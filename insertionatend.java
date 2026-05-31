//   class node{
//     int val;
//     node prev;
//     node next;

//     node(int val){
//         this.val=val;
//         this.next=null;
//         this.prev=null;
//     }
//   }
//   class doublylinked{
//     node head;
//     node tail;

//     //insertion atbegign
//     void AddtoHead(int val){
//         node newnode= new node(val);
//         if(head==null){
//             head=tail=newnode;
//             return;
//         }
//        newnode.next=head;
//        head.prev=newnode;

//        head=newnode;
//     }
  
//   //display function
//   void display(){
//     node temp=head;
//     while (temp!=null) {
//         System.out.print(temp.val+"<=>");
//         temp =temp.next;
//     }
//     System.out.println("null");

//   }

// void addAtlast(int val){
//   node newnode=new node(val);

//   if(head==null){
//     head=tail=newnode;
//     return;
//   }
//   tail.next=newnode;
//   newnode.prev=tail;
//   tail=newnode;
// }
// public class insertionatend {
//    public static void main(String[] args) {
//       doublylinked ll= new doublylinked();
//       ll.AddtoHead(10);
//       ll.AddtoHead(20);
//       ll.display();
//    } 
// }



// class DoublyLinkedList {
//     Node head;
//     Node tail;

//     // Insert at beginning
//     public void insertAtBeginning(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     // Insert at end
//     public void insertAtEnd(int data) {
//         Node newNode = new Node(data);

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         tail.next = newNode;
//         newNode.prev = tail;
//         tail = newNode;
//     }

//     // Delete from beginning
//     public void deleteAtBeginning() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head == tail) {
//             head = tail = null;
//             return;
//         }

//         head = head.next;
//         head.prev = null;
//     }

//     // Delete from end
//     public void deleteAtEnd() {
//         if (head == null) {
//             System.out.println("List is empty");
//             return;
//         }

//         if (head == tail) {
//             head = tail = null;
//             return;
//         }

//         tail = tail.prev;
//         tail.next = null;
//     }

//     // Search element
//     public boolean search(int key) {
//         Node temp = head;

//         while (temp != null) {
//             if (temp.data == key)
//                 return true;
//             temp = temp.next;
//         }
//         return false;
//     }

// //     // Display forward
//     public void displayForward() {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//         System.out.println();
//     }

//     // Display backward
//     public void displayBackward() {
//         Node temp = tail;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.prev;
//         }
//         System.out.println();
//     }
// }