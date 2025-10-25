package OperatorsandNumberSystem;

public class setbit {
  public static void main(String[] args) {
    // set bit
    int n=5;
    int pos=1;
    int BitMask=1<<pos;
    int NewNumber=BitMask | n;
    System.out.println(NewNumber);
  }
}