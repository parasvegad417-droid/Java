package ErrorHandling;
public class whileWithException {
     public static void main(String[] args) {
        int a=10;
        int b=10;
        int c;
        // try and finally block will work
        // only try block cannot work

        while (true) {
            try{
                c=a/b;
                System.out.println(c);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("This is An Finnally Block for b ="+b);  // it eill always execute 
            }
            b--;
        }
     }
}
