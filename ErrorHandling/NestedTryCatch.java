package ErrorHandling;
import java.util.Scanner;
public class NestedTryCatch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 12;
        marks[1] = 12;
        marks[2] = 12;
        System.out.println("enter the Index :");
        int ind = Sc.nextInt();
        System.out.println("Enter the Divider :");
        int divi = Sc.nextInt();
        try {
            try {
                System.out.println(marks[10]);
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
