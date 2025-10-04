class DLL {
    Node HEAD;

    static class Node {
        Node prev;

        int data;

        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void createList() {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        HEAD = n1;
        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
    }

    public void traverseForward() {

        System.out.println("Forward direction -------> ");

        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void traverseBackward() {

        System.out.println("Backward direction <------- ");

        Node current = HEAD;

        while (current.next != null) {
            current = current.next;
        }

        while (current != null) {
            System.out.print(current.data + " <- ");
            current = current.prev;
        }
        System.out.println("NULL");
    }

}

public class P21_Doubly_LL_Creation_Traversal {

    public static void main(String[] args) {
        DLL list = new DLL();

        list.createList();

        list.traverseForward(); // 10 -> 20 -> 30 -> NULL

        list.traverseBackward(); // 30 <- 20 <- 10 <- NULL
    }
}