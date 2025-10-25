package Queue;
public class queue {
    static class Que {
         int arr[];
         int size;
         int rear = -1;

        Que(int n) {
            arr = new int[n];
            this.size = n;
        }

        public  boolean isEmpty() {
            return rear == -1;
        }

        // add
        public  void add(int data) {
            if (rear == size - 1) {
                System.out.println("Full Queue");
            }
            rear++;
            arr[rear] = data;
        }

        // remove(dequeue)
        public  int remove() {
            if (isEmpty()) {
                System.out.println("Empty array");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Que is An empty");
                return -1;
            }
            return arr[0];
        }

        // que using array for push O(1) for remove and peek O(n)
        // fixed size of an array

        // operation 1) Enqueue-add 2) deque-remove 3) peek-
    }

    public static void main(String[] args) {

        Que q = new Que(5);
        q.add(1);
        q.add(2);
        q.add(3);
        // System.out.println(q.peek());
        q.add(4);
        q.add(5);
        q.remove();
        q.add(6);
        q.remove();
        q.add(7);

        while (!q.isEmpty()) {
          System.out.println(q.peek());
          q.remove();
        }
    }
}
