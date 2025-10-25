package ErrorHandling;
import java.util.*;

class MyException extends Exception{
    @Override
    public String toString(){
        return "I Am  toString"; 
    }
    @Override
    public String getMessage() {
        return "I Am GetMessage";
    }
}
public class ExceptionClass {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if(a<9){
            try{
                // throw new MyException();
                throw new ArithmeticException();
     // here we can throe any new exception 

            }
            catch(Exception e){
             System.out.println(e.getMessage());    
             System.out.println(e.toString());    
            //  System.out.println(e);
            e.printStackTrace();    
            }
        }
     }
}
