package OOPs;
class Oops{
    String color;
    String type;
    public void write(){
    System.out.println("Writing something");
    
}
    public void printColor(){
        System.out.println(this.color);
    }
}   

class Student{
   Student(String name ,int age){
    this.name = name;
    this.age= age;
   }
     Student(Student s2){  // copy constructor
    this.name = s2.name;
    this.age= s2.age;
   }
   String name;
   int age;
   public void printName(){
    System.out.println(this.name);
    System.out.println(this.age);
   }
   Student(){

   }
}

public class ClassesAndObject {
    public static void main(String[] args) {
        // Oops o = new Oops();
        // o.color="Brown";
        // Oops o1 = new Oops();
        // o1.type="blue";
        // o1.color ="red";;
        // o.printColor();
        // o1.printColor();


        Student s1 = new Student("aman",24);
        // s1.name="Paras";
        // s1.age=24;
        s1.printName();
        Student s2 = new Student(s1);
        s2.printName();
        //  System.out.println(s1.name);
        //  System.out.println(s1.age);
}
}
