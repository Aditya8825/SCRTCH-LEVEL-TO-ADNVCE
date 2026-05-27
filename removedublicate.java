
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

    // at head;
    void Athead(int val){
        node temp = new node(val);

        if(head==null){
            head=tail=temp;
        }else{
            temp.next=head;
            head=temp;
        }
        size++;
    } 
    void removedublicate(){
        node curr= head;
        while(curr!=null  && curr.next!=null){

            //duplicate found
            if(curr.val==curr.next.val){
                curr.next=curr.next.next;
            }else{
                curr=curr.next;
            }
        }
    }
     void display(){
        if(head==null){
            System.out.println("linked is empty ! ");
            return;
        }
        node temp=head;
        while (temp!=null) {
              System.out.print(temp.val+"->");
              temp=temp.next;
        }
        System.out.println("null");
     }
 }
public class removedublicate {
    public static void main(String[] args) {
        linkedlist ll= new linkedlist();
        ll.Athead(10);
        ll.Athead(10);
        ll.Athead(20);
         ll.Athead(30);
          ll.Athead(40);
          ll.display();
          System.out.println("after remove ");
 ll. removedublicate();
 ll.display();
    }
}
