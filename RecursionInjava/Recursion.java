package RecursionInjava;

public class Recursion {
    public static int printNumber(int num){
        if(num==0){
          return 0;   
        }
        System.out.println(num);
        return printNumber(num-1);
    }
    public static void main(String[] args) {
        int n=5;
        printNumber(n);
    }
}
