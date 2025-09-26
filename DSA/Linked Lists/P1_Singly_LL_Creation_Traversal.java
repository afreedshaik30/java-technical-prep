public class P1_Singly_LL_Creation_Traversal {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Creation
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);

        // Linking Nodes
        head.next = n2;
        n2.next = n3;
        n3.next = n4;

        // Head Poiner to current
        Node current = head;

        // Traversing using current
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}