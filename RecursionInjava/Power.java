package RecursionInjava;

public class Power {
    public static int calPower(int x,int n){
      if(x==0){
        return 0;
      }  // here the stack height is n
      if(n==0){
        return 1;
      }
    //   int xPownm1 = calPower(x, n-1);
    //   int xPowe= x * xPownm1;
    //   return xPowe;
    if(n%2==0){
          return calPower(x, n/2) * calPower(x, n/2); // stack hieght logn
        }
       else{
          return calPower(x, n/2) * calPower(x, n/2) *x;
    }
}
    public static void main(String[] args) {
        // x^n * func(X^n-1)
        int pow=calPower(2, 3);
        System.out.println(pow);
    }
}
