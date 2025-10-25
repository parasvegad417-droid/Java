package OperatorsandNumberSystem;
import java.util.*;

public class update {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int oper =sc.nextInt();
        int n=5;
        int pos=1;
        int BitMask=1<<pos;
        if(oper ==1){
            // set
            int newNumber= BitMask | n;
            System.out.println(newNumber);
        }else{
            // clear
            int newBitMask= ~(BitMask);
            int newNumber = newBitMask & n;
            System.out.println(newNumber);
        }
    }
}
