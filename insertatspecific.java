
class node{
    int val;
    node next;

    node(int val){
        this.val=val;
        this.next=null;
    }
}
     class linkedlist{
        node head;
        node tail;
       int size;

        //add to head
        void AtHead(int val){
            node temp = new node(val);

            if(head==null){
                head=tail=temp;

            }else{
                temp.next=head;
                head=temp;
               
            }
             size++;
        }
        void AddToTail(int val){
             node temp= new node(val);

             if(tail==null){
                head=tail=temp;
             }else{
                tail.next=temp;
                tail=temp;
                
             }
              size++;
        }
         void deleteAtTail(){
            if(tail==null){
                System.out.println("list is empty!");
                return;
            }
           // tail=temp.next;
            if(head.next==null) {
                head=null;
                tail=null;
            size--;
            return;
        }
        node temp =head;
        // travels to sec`TF5   
    
    //travels  to second last node
    while(temp.next!=tail){
           temp=temp.next;
    }
               temp.next=null;
               tail=temp;
               size--;
}
         void deleteAtHead(){
            if(head==null){
                System.out.println("list is empty!");
                return;
            }
            head=head.next;
            if(head==null) tail=null;
            size--;
         }  

            void insertatspecific(int index,int val){
                if(index<0 || index> size){
                    System.out.println("invalid index ");
                    return;
                }
                // at head condition condition
                if(index==0){
                    AtHead(val);
                    return;
                }
                if(index==size){
                    AddToTail(val);
                     return;
                }
                 node newNode = new node(val);
                  node temp=head;

                  for(int i=0; i<index-1; i++){
                    temp=temp.next;
                  }
                  newNode.next=temp.next;
                  temp.next=newNode;
                  size++;
            }
        void display(){
            if(head==null){
                System.out.println("linked list is empty:");
                return;
            }
            node temp =head;
            while(temp!=null){
                System.out.print(temp.val+" -> ");
                temp=temp.next;
            }
            System.out.println("null");
        }
     }
     public class insertatspecific{
        public static void main(String[] args) {
            linkedlist ll= new linkedlist();
            ll.AddToTail(30);
            ll.AddToTail(40);
            ll.AddToTail(50);


            ll.AtHead(10);
            ll.AtHead(20);
            ll.AtHead(25);

            ll.display();
             
            
            System.out.println("after adding spefic : ");
            ll.insertatspecific(4, 90);
            ll.display();

            // System.out.println("after delete node: ");
            // ll.deleteAtHead();
            // ll.deleteAtTail();
            //ll.display();
        }
     }