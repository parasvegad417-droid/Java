package Queue;

import java.util.*;

/**
 * Demonstrates using the Java Collection `Queue` interface with an
 * ArrayDeque implementation.
 *
 * Notes on time complexity (ArrayDeque-backed Queue):
 * - add(offer): O(1) amortized
 * - remove(poll): O(1)
 * - peek: O(1)
 * - isEmpty: O(1)
 *
 * ArrayDeque is a good general-purpose queue (faster than LinkedList in many
 * cases because it uses a resizable circular array). If you need constant-time
 * memory-stable nodes with cheap insert/remove in the middle, consider
 * LinkedList instead.
 */
public class qUsingCollection {

    /**
     * Simple demo that creates a Queue, adds a few integers and then removes
     * and prints them in FIFO order.
     *
     * Time complexity of the demo operations: each add/remove/peek/isEmpty is O(1),
     * so the loop overall is O(n) where n is the number of elements processed.
     */
    public static void main(String[] args) {
        // Use ArrayDeque which implements Queue. The diamond operator <> is used
        // to infer Integer type on the right-hand side.
        Queue<Integer> q = new ArrayDeque<>();

        // Add elements to the queue (each add is O(1) amortized)
        q.add(1);
        q.add(2);
        q.add(1);
        q.add(1);

        // While not empty, print and remove front element (each remove is O(1))
        while(!q.isEmpty()){
            System.out.println(q.peek()); // peek is O(1)
            q.remove(); // remove is O(1)
        }
    }
}

