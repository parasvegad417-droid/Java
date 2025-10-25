package AdvancedJava;
// import java.lang.reflect.Array;
import java.util.*;
public class ArrayListInJava {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(5);
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);
        l1.add(0,2); 
        l1.add(3);
        l1.add(1,4);
        l1.add(5);
        l1.add(6);
        l1.add(4);
        l1.set(0, 122);
        System.out.println(l1.isEmpty());
        System.out.println(l1.indexOf(2));  
        System.out.println(l1.lastIndexOf(4));
        // if not found than it will return -1
        // l1.clear();
        l1.ensureCapacity(200);
        System.out.println(l1.contains(2));
        l1.addAll(0,l2);
        for(int i=0;i<l1.size();i++){
             System.out.println(l1.get(i));
        }
    }
}
