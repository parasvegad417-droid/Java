package OOPs;
// method overloading
// compile time ploymorphism // runtime polymorphism
class poly{
  String name;
  int age;

  public void printName(String name){
    System.out.println(name);
  }
  public void printName(int age){
    System.out.println(age);
  }
  public void printName(int age, String name){
    System.out.println(age + " "+name);
  }

}
public class polymorPhism {
    public static void main(String[] args) {
        poly p = new poly();
        p.printName("paras");
        p.printName(24);
        p.printName(24,"paras");
    }
}
