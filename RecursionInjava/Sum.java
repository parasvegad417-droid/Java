package RecursionInjava;

public class Sum {
    public static int sum(int i,int n, int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return 0;
        }
        sum+=i;
        return sum(i+1, n, sum);
    }
    public static void main(String[] args) {
        sum(1, 10, 0);
    }
}
