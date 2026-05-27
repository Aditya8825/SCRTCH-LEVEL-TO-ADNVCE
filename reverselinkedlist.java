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

    //at head
    void Athead(int val){
        node temp = new node(val);
        if(head== null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    }
    void AddToTail(int val){
        node temp = new node(val);
        if (tail== null){
         head=tail=temp;
        }else{
            tail.next=temp;
            tail=temp;
        }
        size++;
    }
    boolean search(int key){
        node temp=head;
        while(temp!=null){
            if(temp.val==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
     void reverse(){
        node prev=null;
        node curr=head;
        node next=null;

        tail=head;

        while(curr !=null){
            next=curr.next;
            curr.next=prev;
            prev = curr;

        curr = next;
    

    head = prev;
}
        }
     
    void display(){
        if(head==null){
            System.out.println("linkedlist is empty ! ");
            return;
        }
        node temp=head;
        while(temp!=null){

            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}

public class reverselinkedlist {
  public static void main(String[] args) {
    linkedlist ll= new linkedlist();
   ll.Athead(10);
     ll.Athead(20);
       ll.Athead(30);
         ll.Athead(40);
         System.out.println(ll.search(40));
  ll.display();
  ll.reverse();
  ll.display();
  }

  }