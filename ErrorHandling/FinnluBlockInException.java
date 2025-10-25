package ErrorHandling;

public class FinnluBlockInException {
         public static void main(String[] args) {
            
            try{
                  int a=10;
                  int b=10;
                  int c=a+b;
                  System.out.println(c);
            }
            catch(Exception e){
                 System.out.println("Hello World");
            }
            finally{
                System.out.println("This is always run ");
            }
         }   
}
