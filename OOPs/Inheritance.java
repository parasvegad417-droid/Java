package OOPs;
// import Bank;
class shape{
    String color;

    public void area(){
        System.out.println("Dipslays area");
    }

}
// single level inheritance
class Triangle extends shape{
    public void area(int l,int h){
       System.out.println(1/2 * l *h);
    }
      
}
// this is an multilevel inheritance
class eualTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2 * h * l);
    }
}
// heirarchical inheritance
class circle extends shape{
    public void area(int r){
        System.out.println(Math.PI*r*r);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color ="red";
    }
}
