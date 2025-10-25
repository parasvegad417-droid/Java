
package RecursionInjava;

public class ReverseString {

    //timecomplexity : O(n);
    
    public static void reverseString(String name,int ind){
          if(ind==0){
            System.out.print(name.charAt(ind));
            return;
          }
          System.out.print(name.charAt(ind));
          reverseString(name, ind-1);        
    } 
    public static void main(String[] args) {
        String name = "paras";
         reverseString(name,name.length()-1);
    }
}
