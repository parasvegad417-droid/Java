package Strings;
// import java.util.*;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Vegad Paras");
        // char atnindex 0
        System.out.println(sb.charAt(0));  // Output: V

        // to set ant character in any index
        sb.setCharAt(0, 'p');
        System.out.println(sb);

        // insert function
        sb.insert(2, 'n');
        System.out.println(sb);
        

        sb.delete(0, 2);
        System.out.println(sb);


        sb.append("paras");
        System.out.println(sb);
    }
}