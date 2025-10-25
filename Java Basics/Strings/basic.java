package Strings;
public class basic {
    public static void main(String[] args) {
        String name = "Paras";
        String name1 = "Paras";
        // if(name.compareTo(name1)==0){
        //     System.out.println("Both the string are same :  ");
        // }    

        //  if(name==name1){
        //     System.out.println("Both the string are same :  ");
        // }
         if(new String("Paras")==new String("Paras")){
            System.out.println("Both the string are same :  ");
        }
        else{
            System.out.println("Not Equal");
        }
        // substring
        String paras="Vegad";
        String vegad=paras.substring(0,2);  // last index in no exclusive
        System.out.println(vegad);      
        System.out.println(vegad.length());      
    }
}
