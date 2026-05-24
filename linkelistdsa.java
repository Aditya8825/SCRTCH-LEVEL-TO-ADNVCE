// // class node {

// //     int data;
// //     node next;

// //     node(int data) {
// //         this.data = data;
// //         this.next = null;
// //     }
// // }

// // class linkedlist {

// //     node head;
// //     node tail;

// //     // add at tail
// //     void addAtTail(int data) {

// //         node temp = new node(data);

// //         if (tail == null) {
// //             head = tail = temp;
// //         } else {
// //             tail.next = temp;
// //             tail = temp;
// //         }
// //     }

// //     // display linked list
// //     void display() {

// //         if (head == null)
// //             return;

// //         node temp = head;

// //         while (temp != null) {
// //             System.out.print(temp.data + " ");
// //             temp = temp.next;
// //         }
// //     }
// //      void addAtHead(int data){
// //         node temp =new node(data);

// //         if(head==null){
// //             head=tail=temp;
// //         }else{
// //              temp.next=head;
// //              head=temp;
            
// //         }
// //      }

// // }

// // public class linkedlistsda {

// //     public static void main(String[] args) {

// //         linkedlist ll = new linkedlist();

// //         ll.addAtTail(10);
// //         ll.addAtTail(20);
// //         ll.addAtTail(30);


// //         ll.addAtHead(60);
// //         ll.display();
// //     }
// // }





// // //detail explainttionation
// // class node{
// //     int val;
// //     node next;

// //     node(int val){
// //         this.val=val;
// //         this.next=null;
// //     }
// // }
// // class linkedlist{
// //     node head;
// //     node tail;

// //     // add tohead
// //     void addAtHead(int val){
// //         node temp =new node(val);

// //         if(head==null){
// //             head=tail=temp;
// //         }else{
// //             temp.next=head;
// //             head=temp;
// //         }
// //     }
// //     void addAtTail(int val){
// //         node temp =new node(val);

// //         if(tail==null){
// //             head=tail=temp;
// //         }else{
// //             tail.next=temp;
// //         }
// //     }
// //     // display linkedlist 
// //     void display(){

// //        //   node temp=head;
// //         if(head==null)
// //         System.out.println("linked list empty");
// //         return;
// //     }
// //          node temp=head;
// //         while (temp!=null) {
// //             System.out.println(temp.val+" ");
// //             temp=temp.next;
// //             tail=temp;
// //         }
// //     }

// // public class linkelistdsa{
    
// //     public static void main(String[] args) {
// //         linkedlist ll= new linkedlist();
// //         ll.addAtHead(10);;
// //         ll.addAtHead(20);
// //         ll.addAtTail(30);

// //         ll.display();
// //     }
// // }




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
//     void addAtHead(int val) {

//         node temp = new node(val);

//         if (head == null) {
//             head = tail = temp;
//         } else {
//             temp.next = head;
//             head = temp;
//         }
//     }

//     // add at tail
//     void addAtTail(int val) {

//         node temp = new node(val);

//         if (tail == null) {
//             head = tail = temp;
//         } else {
//             tail.next = temp;
//             tail = temp;   // important
//         }
//     }

//     // display linked list
//     void display() {

//         if (head == null) {
//             System.out.println("linked list empty");
//             return;
//         }

//         node temp = head;

//         while (temp != null) {
//             System.out.print(temp.val + " ");
//             temp = temp.next;
//         }
//     }
// }

// public class linkelistdsa {

//     public static void main(String[] args) {

//         linkedlist ll = new linkedlist();

//         ll.addAtHead(10);
//         ll.addAtHead(20);
//         ll.addAtTail(30);

//         ll.display();
//     }
// }