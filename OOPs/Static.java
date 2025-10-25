package OOPs;

class School{
    int age;
    static String name; // common for all the objects
}
public class Static {
    public static void main(String[] args) {
        School.name="GEC Rajkot";
        // School c = new School(); 
        System.out.println(School.name);
    }
}
