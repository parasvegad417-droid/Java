package Queue;

public class qUsingLL {
   static class Node {
    int data;
    Node next;
    
    Node(int data){
        this.data= data;
        this.next= null;
    }
}
  static class Queue1{
    Node head = null;
    Node tail = null;
    public boolean isEmpty(){
        return head == null && tail == null;
    }
    public void add(int data){
     Node newNode = new Node(data);
     if(isEmpty()){
        head = newNode;
        tail = newNode;
     }
     else{
         tail.next = newNode;
         tail = newNode;
     }
    }
    
    public int remove() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = head.data;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        return val;
    }
    
    public int peek() {
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return head.data;
    }
  }
    public static void main(String[] args) {
        Queue1 q = new Queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        
        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
