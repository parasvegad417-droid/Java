package Multithreading;

class Mythr2 extends Thread{
    public Mythr2(String name){
        super(name);
    }
    public void run(){
        System.out.println("I Am The Run Method Of Mythr Class" + this.getName());
    }
}
class Mythr3 extends Thread{

    public void run(){
        System.out.println("I Am The Run Method Of Mythr Class");
    }
}


public class ThreadMethods {
    public static void main(String[] args) {
          Mythr2 t1 = new Mythr2("Paras");
          Mythr2 t2 = new Mythr2("vegad");
           t1.start();
        //    try{
        //     t1.join();
        //    }
        //    catch(Exception e){
        //     System.out.println(e);
        //    };
        try{
            Thread.sleep(1023);
        }catch(Exception e){
            System.out.println(e);
        }
           t2.start();
    }
}