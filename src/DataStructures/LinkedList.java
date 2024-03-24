package DataStructures;

public class LinkedList {
    private Node firstNode;
    private Node lastNode;

    public LinkedList() {
        this.firstNode = null;
        this.lastNode = null;
    }

    //Linked List operations
    //addFirst
    public void addFirst(int value) {
        Node newNode = new Node(value);
        if (firstNode == null && lastNode == null) {
            firstNode = newNode;
            lastNode = newNode;
            newNode.next = null;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
    }

    // addlast
    public void addLast(int value) {
        Node newNode = new Node(value);
        if (firstNode == null && lastNode == null) {
            firstNode = newNode;
            lastNode = newNode;

        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
    }

    public void addMiddle(int value, int position) {
        Node newNode = new Node(value);
        Node currNode = firstNode;
        int count = 1;

        while (firstNode != null && count < position-1) {
            currNode = currNode.next;
            count++;
        }

        newNode.next = currNode.next;
        currNode.next = newNode;

    }

    public void printList(LinkedList list) {

        System.out.print("Linked list is : ");
        Node currNode = list.firstNode;

        while(currNode != null) {
            System.out.print(currNode.value + "->");
            currNode = currNode.next;
        }
    }

    //removeFirst
    //removeLast
    //removeMiddle
    //contains
    //indexOf
}
