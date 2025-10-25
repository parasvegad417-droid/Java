package OOPs;

abstract class hello {
    hello() {
        System.out.println("Heloo");
    }

    abstract void walk(); // cant make an objext of abstract class
    // can have abstract or non absract method
    // ex:
    // it cannot be instantiated
    // it can have constructor and also static method

    public void run() {
        System.out.println("Hello World");
    }
}

class paras extends hello {
    public void walk() {
        System.out.println("Hello Paras bhai ");
    }
}

class vegad extends hello {
    public void walk() {
        System.out.println("Hello World");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        paras p = new paras();
        p.walk();
        vegad v = new vegad(); // constructor chaining because of again constructor will run
        v.walk();
     
        // hello h = new hello(); we cant do this
    }
}
