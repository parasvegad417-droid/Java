package OOPs;

class Myclass{
    Myclass(){ // no perameters
        System.out.println("this is an contructor of this class");
    }
}
public class Constructor {
    // constructor cannot return anything no return type 
    // it willl only called one time
    // it is automatically when we create an object
    // if there is no constructor is implemented thatn java automatically create the condtructor
    public static void main(String[] args) {
        Myclass c = new Myclass();

    }
}
