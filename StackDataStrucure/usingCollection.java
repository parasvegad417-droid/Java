import java.util.*;
class usingCollection{
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.pop();  // remove from last
        System.out.println(s);
        System.out.println(s.reversed());
        System.out.println(s.peek());
        System.out.println(s.search(3));
    }
}