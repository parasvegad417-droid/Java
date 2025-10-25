package ErrorHandling;

public class TryCatch {
    public static void main(String[] args) {
        int a=9000;
        int b=0;

        // without try and catch

            // int c = a/b;
            // System.out.println(c);

        // with try and catch
        try{
            int c= a/b;
        }
        catch(Exception e){
            System.out.println(e);
        }
   }
}
