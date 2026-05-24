
// class  node{

//     //store data
//     int data;

//     // store next node adrees
//     node next;

//     //construction
//     node(int data){
//         this.data=data;
//         this.next=null;
//     }
// }

// //create linked list
// class linkedlist{
//     // head node
//     node head;

//     // insertion node at end;
//           void insertion(int data){

//             //create new node
//               node newnode= new node(data);

//               // if list is empty
//               if(head==null){
//                 head=newnode;

//               }else{
//                 //temp node
//                 node temp=head;

//                 //move to last node
//                 while(temp.next !=null){
//                     temp=temp.next;
//                 }
//                 temp.next=newnode;
//               }
//           }

// }
// public class singlyll {
//  public static void main(String[] args) {
    
//  }   
// }


// Create Node class
// class Node {

//     // Store data
//     int data;

//     // Store next node address
//     Node next;

//     // Constructor
//     Node(int data) {
//         this.data = data;
//         this.next = null;
//     }
// }

// // Create Linked List class
// class LinkedList {

//     // Head node
//     Node head;

//     // Insert node at end
//     void insert(int data) {

//         // Create new node
//         Node newNode = new Node(data);

//         // If list is empty
//         if (head == null) {
//             head = newNode;
//         } else {

//             // Temporary node
//             Node temp = head;

//             // Move to last node
//             while (temp.next != null) {
//                 temp = temp.next;
//             }

//             // Add new node
//             temp.next = newNode;
//         }
//     }

//     // Display linked list
//     void display() {

//         // Temporary node
//         Node temp = head;

//         // Traverse list
//         while (temp != null) {

//             // Print data
//             System.out.print(temp.data + " -> ");

//             // Move to next node
//             temp = temp.next;
//         }

//         // Print null
//         System.out.println("null");
//     }
// }

// // Main class
// public class singlyll {

//     // Main method
//     public static void main(String[] args) {

//         // Create linked list object
//         LinkedList list = new LinkedList();

//         // Insert values
//         list.insert(10);
//         list.insert(20);
//         list.insert(30);

//         // Display list
//         list.display();
//     }
// }