package Multithreading;

class MythreadRunnable1 implements Runnable{
    public void run(){
        System.out.println("Hello I am The Thread! ");
        System.out.println("Hello I am The Thread! ");
        System.out.println("Hello I am The Thread! ");
        System.out.println("Hello I am The Thread! ");
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
        System.out.println("Hello I am The Thread! "); 
    }
}

class MythreadRunnable2 implements Runnable{
    public void run(){
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
        System.out.println("Hello I am The Thread@ ");
    }
}

public class usingRunnableInterface {
    public static void main(String[] args) {
     
        MythreadRunnable1 bullet1 = new MythreadRunnable1();
        Thread t1 = new Thread(bullet1);
        MythreadRunnable2 bullet2 = new MythreadRunnable2();
        Thread t2 = new Thread(bullet2);

        t1.start();
        t2.start();

    }
}
