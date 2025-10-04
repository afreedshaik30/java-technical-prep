class DLlist {
    Node HEAD;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void showDLL() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.data + " <---> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
            return;
        }

        newNode.next = HEAD;
        HEAD.prev = newNode;
        HEAD = newNode;
    }

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
        newNode.prev = current;
    }

    public void insertByIndex(int index, int data) {

        if (index < 0) {
            System.out.println("Invalid Index");
            return;
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
        newNode.prev = current;
        if (current.next != null) {
            current.next.prev = newNode;
        }

        current.next = newNode;
    }

}

public class P22_DLL_Insertion {
    public static void main(String[] args) {
        DLlist dll = new DLlist();

        dll.showDLL();

        dll.insertAtStart(110);
        dll.showDLL();
        
        dll.insertAtEnd(120);
        dll.insertAtEnd(130);
        dll.showDLL();

        dll.insertByIndex(1, 115);
        dll.showDLL();
    }
}
