package LinkedList;

class LL {
    Node head;
    private int size;

    LL() {
        size = 0;
    }
    public class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList() {
        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void removeFirst() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        head = this.head.next;
        size--;
    }
    public void removeLast() {
        if (head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node currNode = head;
        Node lastNode = head.next;
        while (lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public int getSize() {
        return size;
    }
        public void reverseIterate() {
            if (head == null || head.next == null) {
                return;
            }
            Node prevNode = null;
            Node currNode = head;
            while (currNode != null) {
                Node nextNode = currNode.next;
                currNode.next = prevNode;
                // update
                prevNode = currNode;
                currNode = nextNode;
            }
            // head.next = null;
            head = prevNode;
        }   

    public static Node reverseRecursively(Node head){
        if(head==null || head.next == null){
            return head;
        }
        Node newNode = reverseRecursively(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }


    // Q:1

    public static Node removeNthFromLast(Node head,int n){
        // edge condition
        if(head == null){
        return null;
        }
       Node curr = head;
       int size = 0;
       while(curr != null){
        curr=curr.next;
        size++;
       }
       if(n==size){
        return head.next;
       }
       int indexToSearch = size - n;
       Node prev= head;
       int i=1;
       while(i<indexToSearch){
        prev= prev.next;
        i++;
       }
       prev.next =prev.next.next;
       return head;

    }
    public static void main(String args[]) {
        LL list = new LL();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        // list.printList();
        // list.head = reverseRecursively(list.head);
        // list.printList();
        list.head = removeNthFromLast(list.head, 5);
        list.printList();   
    }
}
