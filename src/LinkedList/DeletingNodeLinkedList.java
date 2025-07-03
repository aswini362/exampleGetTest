package LinkedList;

public class DeletingNodeLinkedList {


    public static void deleteNode(Node node) {
        if (node == null || node.next == null) return;
        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static Node findNode(Node head, int value) {
        while (head != null) {
            if (head.data == value) return head;
            head = head.next;
        }
        return null;
    }

    public static void display(Node node) {
        Node current = node;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String [] args){
        Node head=new Node(4);
       head.next=new Node(5);
       head.next.next=new Node(9);
       head.next.next.next=new Node(1);

       display(head);
        Node nodeToDelete = findNode(head, 5);
        deleteNode(nodeToDelete);
        display(head);
    }
}
