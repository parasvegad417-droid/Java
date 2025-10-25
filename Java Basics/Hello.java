abstract class Base{
    public Base(){
        System.out.println("I am an Constructor of base class");
    }
    abstract public void sayHello();
}
  class child extends Base{
    @Override
    public void sayHello(){
   System.out.println("HeLoo my World");
    }
  }
   class child2 extends Base{
    @Override
    public void sayHello(){
    }
   }
  
public class Hello {
  public static void main(String [] args){
    //  Base b = new Base();  Not possible
      child c = new child();
      c.sayHello(); 
       child2 c2= new child2();
       c2.sayHello();
  }
}