package Multithreading;

class Mythr1 extends Thread {
    public Mythr1(String name) {
        super(name);
    }
    public void run() {
        int i = 0;
        while (i < 40) {
            System.out.println("hello" + this.getName());
            i++;
        }
    }
}
public class ThreasPriorities {
    public static void main(String[] args) {
        // ready queue t1 t2 t3 t4 t5 to run responsibilities of JVM
        Mythr1 t1 = new Mythr1("Paras");
        Mythr1 t2 = new Mythr1("Vegad");
        Mythr1 t3 = new Mythr1("Kuldip");
        Mythr1 t4 = new Mythr1("Champaben");
        Mythr1 t5 = new Mythr1("MukesBhai(Most Important)");

        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
