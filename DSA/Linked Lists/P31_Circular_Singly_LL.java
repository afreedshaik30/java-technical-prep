class CSLL {
    Node HEAD = null;
    Node TAIL = null;

    static class Node {
        Node prev;
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void displayCSLL() {

        if (HEAD == null) {
            System.out.println("Empty LL");
            return;
        }

        Node current = HEAD;
        do {
            System.out.print(current.data + " =-=-= ");
            current = current.next;
        } while (current != HEAD);
        System.out.println("NULL");
    }

    public void insertData(int data) {
        Node newNode = new Node(data);

        if (HEAD == null) { // if Empty
            HEAD = newNode;
            TAIL = newNode;
            TAIL.next = HEAD;
        } else {
            TAIL.next = newNode;
            TAIL = newNode;
            TAIL.next = HEAD;
        }
    }
}

public class P31_Circular_Singly_LL {
    public static void main(String[] args) {
        CSLL csll = new CSLL();
        csll.insertData(11);
        csll.insertData(22);
        csll.insertData(33);

        csll.displayCSLL();
    }
}
