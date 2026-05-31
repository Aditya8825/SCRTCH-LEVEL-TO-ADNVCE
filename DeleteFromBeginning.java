class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;

    // Insert at beginning
    void addHead(int val) {
        Node newNode = new Node(val);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }

        head = newNode;
    }

    // Delete from beginning
    void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;

        if (head != null) {
            head.prev = null;
        }
    }

    // Display list
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " <-> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }
}

public class DeleteFromBeginning {
    public static void main(String[] args) {

        DoublyLinkedList ll = new DoublyLinkedList();

        ll.addHead(10);
        ll.addHead(20);
        ll.addHead(30);

        System.out.println("Original List:");
        ll.display();

        ll.deleteAtBeginning();

        System.out.println("After Deleting First Node:");
        ll.display();
    }
}