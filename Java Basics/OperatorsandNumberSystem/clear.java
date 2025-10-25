package OperatorsandNumberSystem;
public class clear {
    //To clear an bit
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int BitMask=1<<pos;
        int notBitmask=~(BitMask);

        int newNumber=notBitmask & n;
        System.out.println(newNumber);
    }
}
