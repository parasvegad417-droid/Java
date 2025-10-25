package RecursionInjava;

public class RemoveDuplicatesInArray {
    public static boolean [] map = new boolean[26];
    public static void duplicatesremove(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(ind);
        if(map[currChar-'a']==true){
             duplicatesremove(str, ind+1, newString);
        }
        else{
            newString += currChar;
            map[currChar-'a']=true;
            duplicatesremove(str, ind+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "parasVegad";
        
        duplicatesremove(str, 0, "");
    }
}
 