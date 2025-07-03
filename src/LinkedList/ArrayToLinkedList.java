package LinkedList;

public class ArrayToLinkedList {
    Node head;

    public void convertArrayToLinkedList(int [] arr){
        if(arr.length<=0){
            return;
        }
        head=new Node(arr[0]);
        Node current=head;

        for(int i=0;i<arr.length;i++){
          current.next=new Node(arr[i]);
          current=current.next;

        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ArrayToLinkedList list = new ArrayToLinkedList();
        int[] arr = {10, 20, 30, 40, 50};
        list.convertArrayToLinkedList(arr);
        list.display(); // Output: 10 -> 20 -> 30 -> 40 -> 50 -> null
    }

}
