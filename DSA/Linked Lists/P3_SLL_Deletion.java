public class P3_SLL_Deletion {

    private Node HEAD;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // start
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = HEAD;
        HEAD = newNode;
    }

    public void deleteAtStart() {
        if (HEAD != null) {
            HEAD = HEAD.next;
        }
    }

    // end
    public void insertAtEnd(int data) {

        Node newNode = new Node(data);
        if (HEAD == null) {
            HEAD = newNode;
            return;
        }
        Node current = HEAD;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void deleteAtEnd() {
        if (HEAD == null || HEAD.next == null) {
            HEAD = null;
            return;
        }

        Node current = HEAD;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // middle or index
    public void insertByIndex(int index, int data) {
        if (index < 0) {
            System.out.println("Invalid Index");
        }

        if (index == 0) {
            insertAtStart(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = HEAD;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException();
        }

        newNode.next = current.next;
        current.next = newNode;

    }

    public void deleteByIndex(int index) {
        if (index < 0) {
            System.out.println("Invalid Index");
        }

        if (index == 0) {
            deleteAtStart();
            return;
        }

        Node current = HEAD;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.next;
        }

        if (current == null || current.next == null) {
            throw new IndexOutOfBoundsException();
        }

        current.next = current.next.next;
    }

    public void display() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        P3_SLL_Deletion list = new P3_SLL_Deletion();

        list.insertAtEnd(30);
        list.display();

        list.insertAtStart(10);
        list.display();

        list.insertByIndex(1, 20);
        list.display();

        list.deleteByIndex(1);
        list.display();

        list.deleteAtStart();
        list.display();

        list.deleteAtEnd();
        list.display();

    }
}
