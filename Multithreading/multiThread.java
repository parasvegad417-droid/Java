package Multithreading;


class Mythread1 extends Thread{
    @Override
     public void run(){
        int i=0;
        while(i<10){
            System.out.println("my thread1 id running");
            System.out.println("i am happy");
            i++;
        }
     };
}

class Mythread2 extends Thread{
      @Override
     public void run(){
        int i=0;
        while(i<10){

            System.out.println("my thread2 id running");
            System.out.println("i am sad");
            i++;
        }
     }
}
public class multiThread {
    public static void main(String[] args) {
         
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
         t1.start();
         t2.start();

    }
}
