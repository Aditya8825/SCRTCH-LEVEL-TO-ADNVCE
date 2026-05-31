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
// }
// public class insertiondll {
//    public static void main(String[] args) {
//       doublylinked ll= new doublylinked();
//       ll.AddtoHead(10);
//       ll.AddtoHead(20);
//       ll.display();
//    } 
// }
