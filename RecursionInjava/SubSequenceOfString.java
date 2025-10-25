package RecursionInjava;

// O(2^n)

public class SubSequenceOfString {
    public static void suSequence(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        suSequence(str, idx+1, newString+currChar);
        suSequence(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str="abc";
        suSequence(str, 0, "");
    }
}
