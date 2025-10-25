package Multithreading;
class Mythr extends Thread{
    public Mythr(String name){
        super(name);
    }
    public void run(){
        System.out.println("I Am The Run Method Of Mythr Class");
    }
}
public class Constructor {
    public static void main(String[] args) {
         Mythr t1 = new Mythr("Paras");
         t1.start();
         System.out.println("THe Id Is :"+ t1.getName());
         System.out.println("THe Id Is :"+ t1.threadId());
         System.out.println("THe Id Is :"+ t1.getClass());
         System.out.println("THe Id Is :"+ t1.hashCode());
         System.out.println("THe Id Is :"+ t1.toString());
         System.out.println("THe Id Is :"+ t1.getPriority());
         System.out.println("THe Id Is :"+ t1.getThreadGroup());
    }
} 
