package AdvancedJava;

import java.util.LinkedList;
// import java.util.ArrayList;

// no fix varialbe size
// no contiguous memory
// insert O(1)
// search O(n)

// types of an linked list 
// 1) sigly 2) doubly 3)circular
public class LInkedlistInJava {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.add(0, 2);
        l1.add(3);
        l1.add(1, 4);
        l1.add(5);
        l1.add(6);
        l1.add(4);

        // methods
        l1.addLast(123);
        l1.addFirst(1); // not present into the arraylist
        l1.removeLast();
        l1.removeFirst();

        for (int i = 0; i < l1.size(); i++) {
            System.out.println(l1.get(i));
        }
    }
}
