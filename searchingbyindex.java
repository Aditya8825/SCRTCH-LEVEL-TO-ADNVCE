// class node{
//     int val;
//     node next;

//     node(int val){
//         this.val=val;
//         this.next=null;
//     }
// }
//  class linkedlist{
//     node head;
//     node tail;
//     int size;
//        //at head
//        void AddToHead(int val){
//         node temp=new node(val);

//         if(head==null){
//             head=tail=temp;
//          }else{
//             temp.next=head;
//             head=temp;
//         }
//         size++;
//     }
//     int searchnyindex(int index){
//         node temp=head;
//         int count=0;

//         while(temp!=null){
//             if(count==index){
//                 return temp.val;
//             }
//             count++;
//             temp=temp.next;
//         }
//         return -1;//
//     }
//     void display(){
//         if(head==null){
//             System.out.println("liked is ! tempty ");
//             return;
//         }
//         node temp=head;
//         while(temp!=null){
//             System.out.print(temp.val+"->");
//             temp=temp.next;
//         }
//         System.out.println("null");
//     }

//  }
// public class searchingbyindex {
// public static void main(String[] args) {
//     linkedlist ll= new linkedlist();
//     ll.AddToHead(10);
//     ll.AddToHead(20);
//     ll.AddToHead(30);
//     ll.AddToHead(40);
//     ll.AddToHead(50);
//     ll.display();
    
//     System.out.println("after seaching");
//     ll.searchnyindex(2);
//      ll.display();


// }
// }
