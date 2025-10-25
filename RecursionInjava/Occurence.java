package RecursionInjava;

// time complexity : O(n)

public class Occurence {
    public static int first = -1;
    public static int last = -1;
    public static void Ocr(String str,int ind,char element){
        if(ind == str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar=str.charAt(ind);
        if(currChar == element){
           if(first==-1){
            first=ind;
        }    
        else{
            last=ind;
        }
        }
        Ocr(str, ind+1, element);
    }
    public static void main(String[] args) {
    String name="abcdesjsksaidfpiasfd";
    Ocr(name, 0, 'a');
    }
}
