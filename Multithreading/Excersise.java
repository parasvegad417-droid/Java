package Multithreading;
class Welcome extends Thread{
    public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
             System.out.println(e);    
            }
            System.out.println("Good Morning !");
        }
    }
}
class good extends Thread{
    public void run(){
       while(true){
         try{
                Thread.sleep(200);
            }
            catch(Exception e){
             System.out.println(e);    
            }
         System.out.println("Hello World");    
    }   
  }
}
public class Excersise {
    public static void main(String[] args) {
        Welcome W=new Welcome();
        good g = new good();
        // W.setPriority(6);
        // g.setPriority(2);
        System.out.println(W.getPriority());
        System.out.println(g.getPriority());
        System.out.println(W.getState());
        System.out.println(g.getState());

        // System.out.println(g.currentThread().getState());

        // W.start();
        // g.start();
    }
}
