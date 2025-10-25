package OOPs;
// all te fiels of interfacec are public static and final by default
// all methods are public and abstract by default
interface Animal{  // Interface does not have an constructor
     public void walk();
     void run();  /// only allows an abstract method Means no implmentations
}

interface Human{
    public void eat();
}

class dog implements Animal,Human{
    public void walk(){
        System.out.println("HEllo");
    }
    public void run(){
        System.out.println("HEllo PAras Bhai");
    }
    public void eat(){
        System.out.println("Hello Vegad Bhai");
    }
}

public class Interfacec {
    public static void main(String[] args) {
        dog d = new dog();
        d.walk();
        d.run();
        d.eat();

    }
}
