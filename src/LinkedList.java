class Node {
    int data;
    Node next;
    public Node(int data){
        this.data = data;
        next =  null;
    }
}
public class LinkedList {

    Node head;

    public void insert(int data){
        if( head == null) {
            head = new Node(data);
            return;
        }
        Node h = head;
        while (h.next != null) {
            h = h.next;
        }
        h.next = new Node(data);
    }

    public void print() {
        Node h = head;
        while( h != null){
            System.out.print(h.data + "->");
            h = h.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public static void main(String ...args){
        LinkedList linkedList = new LinkedList();
        linkedList.insert(10);
        linkedList.insert(20);
        linkedList.insert(30);
        linkedList.insert(40);
        linkedList.print();
        linkedList.insert(50);
        linkedList.print();
    }
}
