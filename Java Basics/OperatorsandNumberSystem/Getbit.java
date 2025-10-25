package OperatorsandNumberSystem;

public class Getbit {
    public static void main(String[] args) {
        int n=5;
        int pos=1;
        int BitMask=1<<pos;

        // Get Bit
        if((BitMask & n)==0){
            System.out.println("it was zero");
        }
        else
        {
            System.out.println("THe bit was not Zero Means it is one");
        }
    }
    
}
